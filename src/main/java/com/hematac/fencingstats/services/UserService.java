package com.hematac.fencingstats.services;

import com.hematac.fencingstats.dtos.UserDto;
import com.hematac.fencingstats.models.userhandling.Role;
import com.hematac.fencingstats.models.userhandling.User;

import java.util.List;

public interface UserService {
  List<UserDto> findAll();
  User findById(long id);
  void deleteById(long id);
  UserDto save(UserDto userDto);

  void saveRole(Role role);


}
