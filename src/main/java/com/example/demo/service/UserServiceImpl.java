package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of the {@link UserService} interface that provides user management operations.
 * <p>
 * This service interacts with the repository layer to perform CRUD operations on user data.
 */
@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface fakeRepo;

    /**
     * Constructs a new {@link UserServiceImpl} with the provided {@link FakeRepoInterface}.
     *
     * @param fakeRepo the {@link FakeRepoInterface} instance used to interact with the repository layer.
     */
    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    /**
     * Adds a new user with the given name and surname to the repository.
     * A unique ID is generated based on the current system time.
     *
     * @param name the name of the user to add.
     * @param surname the surname of the user to add.
     */
    @Override
    public void addUser(String name, String surname) {
        long id = System.currentTimeMillis();
        System.out.println(fakeRepo.insertUser(id, name, surname));
    }

    /**
     * Removes a user by their unique ID from the repository.
     *
     * @param id the unique ID of the user to remove.
     */
    @Override
    public void removeUser(long id) {
        System.out.println(fakeRepo.deleteUser(id));
    }

    /**
     * Retrieves a user by their unique ID from the repository.
     *
     * @param id the unique ID of the user to retrieve.
     */
    @Override
    public void getUser(long id) {
        System.out.println(fakeRepo.findUserById(id));
    }
}
