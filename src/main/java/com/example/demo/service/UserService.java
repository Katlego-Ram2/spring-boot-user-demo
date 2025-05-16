package com.example.demo.service;

/**
 * Service interface for managing user operations.
 * <p>
 * This interface provides methods to add, remove, and retrieve users.
 * Implementations of this interface should handle the actual business logic related to user management.
 * </p>
 */
public interface UserService {

    /**
     * Adds a new user with the specified name and surname.
     *
     * @param name    The first name of the user.
     * @param surname The surname of the user.
     * @throws IllegalArgumentException if the name or surname is invalid.
     */
    void addUser(String name, String surname);

    /**
     * Removes the user with the given ID.
     *
     * @param id The unique ID of the user to be removed.
     * @throws IllegalArgumentException if the user ID does not exist.
     */
    void removeUser(long id);

    /**
     * Retrieves the user with the specified ID.
     *
     * @param id The unique ID of the user to retrieve.
     * @return The user associated with the given ID.
     * @throws IllegalArgumentException if the user ID does not exist.
     */
    void getUser(long id);
}
