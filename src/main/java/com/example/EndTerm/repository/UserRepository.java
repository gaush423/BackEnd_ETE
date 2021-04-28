package com.example.EndTerm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EndTerm.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
