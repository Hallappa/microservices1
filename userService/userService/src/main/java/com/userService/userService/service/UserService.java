package com.userService.userService.service;

import com.userService.userService.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
public User saveUsre(User user);
    public List<User> findUser();
    public User findUserById(String id);


}
