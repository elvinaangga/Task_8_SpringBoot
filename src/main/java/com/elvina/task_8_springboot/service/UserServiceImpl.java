package com.elvina.task_8_springboot.service;

import com.elvina.task_8_springboot.dao.UserDao;
import com.elvina.task_8_springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
    public class UserServiceImpl implements UserService {

        private final UserDao userDao;

        @Autowired
        public UserServiceImpl(UserDao userDao) {
            this.userDao = userDao;
        }
        @Override
        public List<User> findAll() {
            return  userDao.findAll();
        }

        @Override
        public Optional<User> findById(Long id) {
            return Optional.empty();
        }

        @Override
        @Transactional
        public void save(User user) {
            userDao.save(user);
        }

        @Override
        @Transactional
        public void update(User user) {
            userDao.update(user);
        }

        @Override
        @Transactional
        public void delete(Long id) {
            userDao.delete(id);

        }
    }

