package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class Controllers {

    @GetMapping("/test")
    public String test(Principal principal) {

        System.out.println(principal != null
                ? "test page ---------- username: " + principal.getName()
                : "test page ---------- no username");

        return "test";
    }
}
