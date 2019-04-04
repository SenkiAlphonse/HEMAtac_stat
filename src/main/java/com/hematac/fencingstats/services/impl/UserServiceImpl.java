package com.hematac.fencingstats.services.impl;

import com.hematac.fencingstats.dtos.OAuth2UserInfo;
import com.hematac.fencingstats.dtos.UserDto;
import com.hematac.fencingstats.models.userhandling.Role;
import com.hematac.fencingstats.models.userhandling.RoleType;
import com.hematac.fencingstats.models.userhandling.User;
import com.hematac.fencingstats.repositories.RoleRepository;
import com.hematac.fencingstats.repositories.UserRepository;
import com.hematac.fencingstats.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

  private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

  private UserRepository userRepository;
  private RoleRepository roleRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository){
    this.userRepository = userRepository;
    this.roleRepository = roleRepository;
  }

  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userRepository.findByEmail(email);
    if(user == null){
      log.error("Invalid email.");
      throw new UsernameNotFoundException("Invalid email.");
    }
    Set<GrantedAuthority> grantedAuthorities = getAuthorities(user);

    return OAuth2UserInfo.create(user, grantedAuthorities);
  }

  private Set<GrantedAuthority> getAuthorities(User user) {
    Set<Role> roleByUserId = user.getRoles();
    return roleByUserId.stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getType().toString().toUpperCase())).collect(Collectors.toSet());
  }

  @Override
  public List<UserDto> findAll() {
    List<UserDto> users = new ArrayList<>();
    userRepository.findAll().iterator().forEachRemaining(user -> users.add(user.toUserDto()));
    return users;
  }

  @Override
  public User findById(long id) {
    return userRepository.findById(id);
  }

  @Override
  public void deleteById(long id) {
    userRepository.deleteById(id);
  }

  @Override
  public UserDto save(UserDto userDto) {
    User userWithDuplicateEmail = userRepository.findByEmail(userDto.getEmail());
    if(userWithDuplicateEmail != null && userDto.getId() != userWithDuplicateEmail.getId()) {
      log.error(String.format("Duplicate email %", userDto.getEmail()));
      throw new RuntimeException("Duplicate email.");
    }
    User user = new User();
    user.setEmail(userDto.getEmail());
    List<RoleType> roleTypes = new ArrayList<>();
    userDto.getRoles().stream().map(role -> roleTypes.add(RoleType.valueOf(role)));
    user.setRoles(roleRepository.find(userDto.getRoles()));
    userRepository.save(user);
    return userDto;
  }

  @Override
  public void saveRole(Role role) {
    roleRepository.save(role);
  }
}
