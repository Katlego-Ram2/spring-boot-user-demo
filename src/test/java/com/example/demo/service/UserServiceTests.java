package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeRepoTest {

    private FakeRepo fakeRepo;
    // Initialize the FakeRepo instance
    @BeforeEach
    void setUp() {
        fakeRepo = new FakeRepo();
    }

    @Test
    void testInsertUser() {
        String result = fakeRepo.insertUser(1, "katlego", "rampedi");
        assertEquals("katlego added", result);
    }

    @Test
    void testFindUserById() {
        fakeRepo.insertUser(1, "katlego", "rampedi");
        String result = fakeRepo.findUserById(1);
        assertEquals("Hello katlego", result);
    }

    @Test
    void testDeleteUser() {
        fakeRepo.insertUser(1, "katlego", "rampedi");
        String result = fakeRepo.deleteUser(1);
        assertEquals("katlego removed", result);
    }

    @Test
    void testFindUserByIdNotFound() {
        String result = fakeRepo.findUserById(1);
        assertEquals("User not found", result);
    }

    @Test
    void testDeleteUserNotFound() {
        String result = fakeRepo.deleteUser(1);
        assertEquals("User not found", result);
    }
}
