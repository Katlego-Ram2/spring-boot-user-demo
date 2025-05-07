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
     * @return A success message.
     */
    @PostMapping
    public String addUser(
            @RequestParam String name,
            @RequestParam String surname
    ) {
        userService.addUser(name, surname);
        return name + " added successfully.";
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param id The user's unique ID.
     * @return A status message after lookup.
     */
    @GetMapping("/{id}")
    public String getUser(@PathVariable long id) {
        userService.getUser(id);
        return "User lookup completed.";
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
        return "User deletion attempted.";
    }
}
