package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link FakeRepo} class.
 * <p>
 * These tests verify the functionality of basic user operations
 * such as insert, retrieve, and delete.
 */
class FakeRepoTest {

    private FakeRepo fakeRepo;

    /**
     * Sets up a new instance of {@link FakeRepo} before each test case.
     */
    @BeforeEach
    void setUp() {
        fakeRepo = new FakeRepo();
    }

    /**
     * Tests that inserting a user returns the expected success message.
     */
    @Test
    void testInsertUser() {
        String result = fakeRepo.insertUser(1, "katlego", "rampedi");
        assertEquals("katlego added", result, "User insertion message mismatch");
    }

    /**
     * Tests that retrieving a user by ID returns the correct greeting.
     */
    @Test
    void testFindUserById() {
        fakeRepo.insertUser(1, "katlego", "rampedi");
        String result = fakeRepo.findUserById(1);
        assertEquals("Hello katlego", result, "User greeting message mismatch");
    }

    /**
     * Tests that deleting an existing user returns the correct confirmation.
     */
    @Test
    void testDeleteUser() {
        fakeRepo.insertUser(1, "katlego", "rampedi");
        String result = fakeRepo.deleteUser(1);
        assertEquals("katlego removed", result, "User deletion message mismatch");
    }

    /**
     * Tests that trying to retrieve a non-existent user returns a 'not found' message.
     */
    @Test
    void testFindUserByIdNotFound() {
        String result = fakeRepo.findUserById(1);
        assertEquals("User not found", result, "Expected user not found message");
    }

    /**
     * Tests that attempting to delete a non-existent user returns a 'not found' message.
     */
    @Test
    void testDeleteUserNotFound() {
        String result = fakeRepo.deleteUser(1);
        assertEquals("User not found", result, "Expected user not found message on delete");
    }
}
