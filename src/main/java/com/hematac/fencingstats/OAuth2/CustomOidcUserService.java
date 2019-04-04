package com.hematac.fencingstats.OAuth2;

import com.hematac.fencingstats.dtos.OAuth2UserInfo;
import com.hematac.fencingstats.models.userhandling.Role;
import com.hematac.fencingstats.models.userhandling.RoleType;
import com.hematac.fencingstats.models.userhandling.User;
import com.hematac.fencingstats.repositories.RoleRepository;
import com.hematac.fencingstats.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class CustomOidcUserService extends OidcUserService {

  private UserRepository userRepository;
  private RoleRepository roleRepository;

  @Autowired
  public CustomOidcUserService(UserRepository userRepository, RoleRepository roleRepository) {
    this.userRepository = userRepository;
    this.roleRepository = roleRepository;
  }

  @Override
  public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
    OidcUser oidcUser = super.loadUser(userRequest);
    Map attributes = oidcUser.getAttributes();
    OAuth2UserInfo userInfo = new OAuth2UserInfo();
    userInfo.setEmail((String) attributes.get("email"));
    userInfo.setId((String) attributes.get("sub"));
    userInfo.setImageUrl((String) attributes.get("picture"));
    userInfo.setName((String) attributes.get("name"));
    updateUser(userInfo);
    return oidcUser;
  }

  protected void updateUser(OAuth2UserInfo userInfo) {
    User user = userRepository.findByEmail(userInfo.getEmail());
    if (user == null) {
      Set<Role> roles = new HashSet<Role>();
      roles.add(roleRepository.findByType(RoleType.USER));
      if (userInfo.getEmail().equals(System.getenv("GOD_USER_EMAIL"))) {
        roles.add(roleRepository.findByType(RoleType.GLOBAL_ADMIN));
      }
      user = new User();
      user.setRoles(roles);
    }
    user.setEmail(userInfo.getEmail());
    user.setImageUrl(userInfo.getImageUrl());
    user.setName(userInfo.getName());

    userRepository.save(user);
  }
}
