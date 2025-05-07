package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service implementation for user operations.
 * Delegates data operations to the FakeRepoInterface.
 */
@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface fakeRepo;

    /**
     * Constructor-based dependency injection for the fake repository.
     *
     * @param fakeRepo the in-memory user repository
     */
    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    /**
     * Adds a new user by generating an alphanumeric ID and calling the repository.
     *
     * @param name    The user's first name.
     * @param surname The user's last name.
     */
    @Override
    public void addUser(String name, String surname) {
        // Generate an alphanumeric ID using UUID's hashCode
        long id = Math.abs(UUID.randomUUID().toString().hashCode());
        System.out.println(fakeRepo.insertUser(id, name, surname));
    }

    /**
     * Removes a user by ID.
     *
     * @param id The ID of the user to remove.
     */
    @Override
    public void removeUser(long id) {
        System.out.println(fakeRepo.deleteUser(id));
    }

    /**
     * Retrieves and displays a user by ID.
     *
     * @param id The ID of the user to retrieve.
     */
    @Override
    public void getUser(long id) {
        System.out.println(fakeRepo.findUserById(id));
    }
}
