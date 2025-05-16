package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * A fake in-memory repository that simulates user data storage.
 * Implements basic CRUD operations using a List.
 */
@Repository
public class FakeRepo implements FakeRepoInterface {

    /**
     * Internal list to store User objects in memory.
     */
    private final List<User> users = new ArrayList<>();

    /**
     * Inserts a new user into the in-memory list.
     *
     * @param id      Unique identifier for the user.
     * @param name    User's first name.
     * @param surname User's last name.
     * @return A confirmation message with the user's name.
     */
    @Override
    public String insertUser(long id, String name, String surname) {
        User user = new User(id, name, surname);
        users.add(user);
        return String.format("User %s has been successfully added with ID: %d.", name, id);

    }

    /**
     * Finds a user by their ID.
     *
     * @param id User's unique ID.
     * @return A greeting message if found, otherwise an error message.
     */
    @Override
    public String findUserById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return "Hello " + user.getName();
            }
        }
        return "User not found";
    }

    /**
     * Deletes a user by their ID.
     *
     * @param id User's unique ID.
     * @return A message indicating success or failure of the deletion.
     */
    @Override
    public String deleteUser(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return user.getName() + " removed";
            }
        }
        return "User not found";
    }
}
