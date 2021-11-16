package com.xadmin.mockito.dao;

import com.xadmin.mockito.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
