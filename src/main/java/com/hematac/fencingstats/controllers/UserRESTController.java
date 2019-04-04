package com.hematac.fencingstats.controllers;

import com.hematac.fencingstats.dtos.UserDto;
import com.hematac.fencingstats.models.userhandling.User;
import com.hematac.fencingstats.services.AuthenticationFacadeService;
import com.hematac.fencingstats.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRESTController {

  private static final Logger log = LoggerFactory.getLogger(UserController.class);

  public static final String ROLE_GLOBAL_ADMIN = "ROLE_GLOBAL_ADMIN";
  public static final String ROLE_USER = "ROLE_USER";

  private UserService userService;
  private AuthenticationFacadeService authenticationFacadeService;

  @Autowired
  public UserRESTController(UserService userService, AuthenticationFacadeService authenticationFacadeService){
    this.userService = userService;
    this.authenticationFacadeService = authenticationFacadeService;
  }

  @Secured({ROLE_USER})
  @GetMapping
  public ResponseEntity<List<UserDto>> listUser() {
    log.info(String.format("received request to list user %s", authenticationFacadeService.getAuthentication().getPrincipal()));
    return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
  }

  @Secured({ROLE_GLOBAL_ADMIN})
  @PostMapping
  public ResponseEntity<UserDto> create(@RequestBody UserDto user) {
    log.info(String.format("received request to create user %s", authenticationFacadeService.getAuthentication().getPrincipal()));
    return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
  }

  @Secured({ROLE_GLOBAL_ADMIN})
  @GetMapping(value = "/{id}")
  public ResponseEntity<User> getUser(@PathVariable long id) {
    log.info(String.format("received request to update user %s", authenticationFacadeService.getAuthentication().getPrincipal()));
    return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
  }

  @Secured({ROLE_GLOBAL_ADMIN})
  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable(value = "id") Long id) {
    log.info(String.format("received request to delete user %s", authenticationFacadeService.getAuthentication().getPrincipal()));
    userService.deleteById(id);
  }
}
