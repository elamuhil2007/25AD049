package com.skillswap.controller;
import com.skillswap.entity.User;
import com.skillswap.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService; } // Create new user
@PostMapping
public User createUser(@RequestBody User user) {
        return userService.createUser(user); } // Get all users
@GetMapping
public List<User> getAllUsers() {
        return userService.getAllUsers(); } // Get user by ID
@GetMapping("/{id}")
public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id); } // Delete user
@DeleteMapping("/{id}")
public String deleteUser(
        @PathVariable Long id) { userService.deleteUser(id);
        return "User deleted successfully"; } // Login
@PostMapping("/login")
public String login(
        @RequestBody User user) { User loggedInUser = userService.login(user.getEmail(), user.getPassword());
        if (loggedInUser != null) {
            return "Login successful";
        }
        return "Invalid email or password";
    }
}