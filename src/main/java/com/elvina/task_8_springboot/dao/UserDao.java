package com.elvina.task_8_springboot.dao;

import com.elvina.task_8_springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao {
        List<User> findAll();
        Optional<User> findById(Long id);
        User save(User user);
        User update(User user);
        void delete(Long id);
    }

