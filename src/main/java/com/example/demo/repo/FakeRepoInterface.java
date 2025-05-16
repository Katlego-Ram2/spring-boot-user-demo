package com.example.demo.repo;

import com.example.demo.model.User;

/**
 * Interface representing the repository for user management.
 * Provides methods for inserting, retrieving, and deleting users.
 */
public interface FakeRepoInterface {

    /**
     * Inserts a new user into the repository.
     *
     * @param id The unique identifier for the user.
     * @param name The first name of the user.
     * @param surname The last name of the user.
     * @return A success message indicating the user has been added.
     */
    String insertUser(long id, String name, String surname);

    /**
     * Retrieves a user from the repository by their unique identifier.
     *
     * @param id The unique identifier of the user to be retrieved.
     * @return A greeting message for the user if found, otherwise an error message.
     */
    String findUserById(long id);

    /**
     * Deletes a user from the repository by their unique identifier.
     *
     * @param id The unique identifier of the user to be deleted.
     * @return A message indicating the success or failure of the deletion.
     */
    String deleteUser(long id);
}
