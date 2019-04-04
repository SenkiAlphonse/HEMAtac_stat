package com.hematac.fencingstats.controllers;

import com.hematac.fencingstats.models.userhandling.Role;
import com.hematac.fencingstats.models.userhandling.RoleType;
import com.hematac.fencingstats.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService){
    this.userService = userService;

    Role roleUser = new Role();
    roleUser.setType(RoleType.USER);
    roleUser.setDescription("users can access basic data and see other users data if allowed by them");

    Role roleAdmin = new Role();
    roleAdmin.setType(RoleType.GLOBAL_ADMIN);
    roleAdmin.setDescription("Global admins can do ANYTHING.");
    this.userService.saveRole(roleUser);
    this.userService.saveRole(roleAdmin);
  }

  @GetMapping({"/", "/home"})
  public String home(){
    return "home";
  }

  @GetMapping("/logout")
  public String logOut(HttpSession session){
    session.invalidate();
    return "home";
  }
}
