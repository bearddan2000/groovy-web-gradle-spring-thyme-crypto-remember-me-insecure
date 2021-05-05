package example.controller.rest;

import example.model.User;
import example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
class UserRestController {

  @Autowired
  public UserService userService;

  @GetMapping("/user/api")
  public List<User> allUsers() {
    return userService.findAll();
  }
}
