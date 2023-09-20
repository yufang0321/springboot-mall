package com.winniewang.springbootmall.service;

import com.winniewang.springbootmall.dto.UserLoginRequest;
import com.winniewang.springbootmall.dto.UserRegisterRequest;
import com.winniewang.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
