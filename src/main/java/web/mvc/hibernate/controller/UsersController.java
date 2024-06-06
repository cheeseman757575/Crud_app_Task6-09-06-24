package web.mvc.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.mvc.hibernate.model.User;
import web.mvc.hibernate.service.UserService;

import java.util.List;

@Controller
public class UsersController {

     private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all_users")
    public String getAllUsers (Model model) {
        List<User> users = userService.getAllUsers();
        return "list_users";
    }
}
