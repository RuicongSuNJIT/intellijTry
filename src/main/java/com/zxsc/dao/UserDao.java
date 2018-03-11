package com.zxsc.dao;

import com.zxsc.annotation.MyBatisRepository;
import com.zxsc.pojo.User;
import com.zxsc.pojo.UserLogin;

import java.util.List;

@MyBatisRepository
public interface UserDao {
    List<User> selectUserLogin(UserLogin userLogin);
}
