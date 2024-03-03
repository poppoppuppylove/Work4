package com.ninethreenine.work4.service;

import com.ninethreenine.work4.dao.UserRepository;
import com.ninethreenine.work4.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 根据用户名获取用户信息
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // 添加新用户
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
