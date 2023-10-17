package com.superman.www.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/")
  public String index(){
    System.out.println("=========인덱스페이지이동==============");
    return "index.html";
  }

  @GetMapping("/user/login")
  public String login(){
    return "user/login";
  }

}
