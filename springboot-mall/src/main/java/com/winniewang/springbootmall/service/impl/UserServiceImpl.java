package com.winniewang.springbootmall.service.impl;

import com.winniewang.springbootmall.dao.UserDao;
import com.winniewang.springbootmall.dto.UserRegisterRequest;
import com.winniewang.springbootmall.model.User;
import com.winniewang.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest){
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
