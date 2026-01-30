package com.yonsai.deploy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

@GetMapping("/")
public String home() {
log.info("Home 메서드 실행!");
System.out.println("home메서드 실행!");
return "home";
}


@GetMapping("/login")
public String login() {
log.info("login 메서드 실행!");
System.out.println("login메서드 실행!");
return "login";
}

	// 가장 간단하게 EC2 환경에서

}