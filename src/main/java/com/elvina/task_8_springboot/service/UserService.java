package com.elvina.task_8_springboot.service;

import com.elvina.task_8_springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public interface UserService {
        List<User> findAll();
        Optional<User> findById(Long id);
        void save(User user);
        void update(User user);
        void delete(Long id);
    }

