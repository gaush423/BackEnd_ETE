package com.example.EndTerm.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.EndTerm.model.User;

public interface UserService {
List<User>getAllUser();
void saveUser(User user);
User getUserById(long id);
void deleteUserById(long id);
Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
