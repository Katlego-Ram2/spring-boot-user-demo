package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public void addUser(String name, String surname) {
        long id = System.currentTimeMillis();
        System.out.println(fakeRepo.insertUser(id, name, surname));
    }

    @Override
    public void removeUser(long id) {
        System.out.println(fakeRepo.deleteUser(id));
    }

    @Override
    public void getUser(long id) {
        System.out.println(fakeRepo.findUserById(id));
    }
}
