package com.example.demo.UserController;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for handling user operations.
 * Provides endpoints to add, retrieve, and delete users.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    /**
     * Constructor-based dependency injection for UserService.
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Adds a new user with the given name and surname.
     *
     * @param name    The user's first name.
     * @param surname The user's surname.
     * @return A success message with the user's ID.
     */
    @PostMapping
    public String addUser(
            @RequestParam String name,
            @RequestParam String surname
    ) {
        // Generate a user ID using current time (or another method)
        long userId = System.currentTimeMillis(); // Simulating unique user ID generation
        userService.addUser(name, surname);
        return name + " added successfully with ID: " + userId;
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param id The user's unique ID.
     * @return A message with user details.
     */
    @GetMapping("/{id}")
    public String getUser(@PathVariable long id) {
        userService.getUser(id);
        return "User with ID: " + id + " lookup completed.";
    }

    /**
     * Deletes a user by their ID.
     *
     * @param id The user's unique ID.
     * @return A status message after deletion attempt.
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id) {
        userService.removeUser(id);
        return "User with ID: " + id + " deletion attempted.";
    }
}
