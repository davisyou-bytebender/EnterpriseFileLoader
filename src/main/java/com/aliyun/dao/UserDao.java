package com.aliyun.dao;

import com.aliyun.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author davis you
 * @Date 2022/8/9 8:14 PM
 * @Version 1.0
 */
@Mapper
public interface UserDao {
    User login(User user);
}
