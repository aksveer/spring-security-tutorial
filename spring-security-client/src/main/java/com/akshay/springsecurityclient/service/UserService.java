package com.akshay.springsecurityclient.service;

import com.akshay.springsecurityclient.entity.User;
import com.akshay.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
