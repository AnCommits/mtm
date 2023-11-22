package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.service.UserService;

@Controller
public class AdminControllers {

    private final UserService userService;

    public AdminControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }
}
