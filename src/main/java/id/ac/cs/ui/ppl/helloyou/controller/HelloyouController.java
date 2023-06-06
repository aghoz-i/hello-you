package id.ac.cs.ui.ppl.helloyou.controller;

import id.ac.cs.ui.ppl.helloyou.model.User;
import id.ac.cs.ui.ppl.helloyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class HelloyouController {
    private static final String REDIRECTTOHOMEPAGE = "redirect:/";

    @Autowired
    private UserService userService;

    @GetMapping()
    public String homepage(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "homepage";
    }

    @GetMapping(value = "/add-user")
    public String createUser(Model model) {
        model.addAttribute("newUser", new User());
        return "form_user";
    }

    @PostMapping(value = "/add-user")
    public String createUser(@RequestParam String name) {
        userService.createUser(name);
        return REDIRECTTOHOMEPAGE;
    }

    @GetMapping(value = "/user/{userId}/delete-user")
    public String deleteUser(@PathVariable String userId) {
      userService.deleteUser(userId);
      return REDIRECTTOHOMEPAGE;
    }

    @GetMapping(value = "/user/{userId}/say-hello")
    public String sayHello(@PathVariable String userId,
                           Model model) {
        model.addAttribute("user", userService.getUserById(userId));
        return "say_hello";
    }
}
