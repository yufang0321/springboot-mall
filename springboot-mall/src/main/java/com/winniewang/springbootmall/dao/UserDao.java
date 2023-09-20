package com.winniewang.springbootmall.dao;

import com.winniewang.springbootmall.dto.UserRegisterRequest;
import com.winniewang.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
