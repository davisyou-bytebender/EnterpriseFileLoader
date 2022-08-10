package com.aliyun.service.impl;

import com.aliyun.dao.UserDao;
import com.aliyun.entity.User;
import com.aliyun.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author davis you
 * @Date 2022/8/9 8:20 PM
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
        User userData = userDao.login(user);
        return userData;
    }
}
