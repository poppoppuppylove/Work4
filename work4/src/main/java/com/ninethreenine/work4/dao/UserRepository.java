package com.ninethreenine.work4.dao;

import com.ninethreenine.work4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 可以添加自定义的查询方法
}
