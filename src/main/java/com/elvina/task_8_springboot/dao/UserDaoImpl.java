package com.elvina.task_8_springboot.dao;

import com.elvina.task_8_springboot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
    @Transactional
    public class UserDaoImpl implements UserDao {

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        public List<User> findAll() {
            return entityManager.createQuery("SELECT u FROM User u", User.class)
                    .getResultList();
        }

        @Override
        public Optional<User> findById(Long id) {
            return Optional.ofNullable(entityManager.find(User.class, id));
        }

        @Override
        @Transactional
        public User save(User user) {
            entityManager.persist(user);
            return user;
        }

        @Override
        @Transactional
        public User update(User user) {
            return entityManager.merge(user);
        }

        @Override
        @Transactional
        public void delete(Long id) {
            User user = entityManager.find(User.class, id);
            if (user != null) {
                entityManager.remove(user);
            }
        }
    }

