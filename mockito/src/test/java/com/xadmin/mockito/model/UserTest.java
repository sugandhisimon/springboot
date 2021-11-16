package com.xadmin.mockito.model;

import com.xadmin.mockito.dao.UserRepository;
import com.xadmin.mockito.service.UserService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Id;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.junit.Assert.assertEquals;



import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService service;

    @MockBean
    private UserRepository repository;

    @org.junit.Test
    public void getUserTest() {
        when (repository.findAll()).thenReturn(Stream.of(new User(100, "allen" , "shuttle", "24")).collect(Collectors.toList()));
        assertEquals(3,service.getAllUsers().size());
    }

    @org.junit.Test
    public void addUserTest()
    {
        User User = new User (101, "sam" , "carrom", "26");

        when(repository.save(User)).thenReturn(User);
        assertEquals(User,service.saveUser(User));
    }

    @org.junit.Test
    public void deleteUser() {
        User User = new User(103, "alex", "snooker", "28");
        service.deleteUSerById(User.getId());
        verify(repository,times(1)).deleteById(User.getId());
    }



}