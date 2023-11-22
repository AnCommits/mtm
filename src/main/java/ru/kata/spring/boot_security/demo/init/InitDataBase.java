package ru.kata.spring.boot_security.demo.init;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitDataBase {

    private final UserService userService;

    public InitDataBase(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        if (userService.countUsers() == 0) {
            Role role1 = new Role("ADMIN");
            Set<Role> roles1 = Set.of(role1);
            User user1 = new User("1", "1", roles1);
            userService.saveUser(user1);

            Role role2 = new Role("USER");
            Set<Role> roles2 = Set.of(role2);
            User user2 = new User("2", "2", roles2);
            userService.saveUser(user2);
        }
    }
}
