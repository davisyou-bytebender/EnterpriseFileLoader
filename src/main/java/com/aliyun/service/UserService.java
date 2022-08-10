package com.aliyun.service;

import com.aliyun.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author davis you
 * @Date 2022/8/9 8:19 PM
 * @Version 1.0
 */
public interface UserService {
    User login(User user);
}
