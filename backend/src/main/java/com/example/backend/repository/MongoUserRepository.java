package com.example.backend.repository;

import com.example.backend.model.MongoUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MongoUserRepository extends MongoRepository<MongoUser, String> {
    Optional<MongoUser> findByUsername(String username);
    boolean existsByUsername(String username);
}
