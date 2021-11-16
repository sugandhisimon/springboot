package com.xadmin.mockito.service;


import com.xadmin.mockito.dao.UserRepository;
import com.xadmin.mockito.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser (User user)
    {
        return repository.save(user);
    }

    public List<User> getAllUsers()
    {
        return repository.findAll();
    }

    public void deleteUSerById(int id)
    {
        repository.deleteById(id);

    }

}
