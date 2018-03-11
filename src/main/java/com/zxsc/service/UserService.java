package com.zxsc.service;

import com.zxsc.dao.UserDao;
import com.zxsc.pojo.User;
import com.zxsc.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User login(UserLogin userLogin){
        List<User> users = userDao.selectUserLogin(userLogin);
        if(users != null && users.size() != 0){
            return users.get(0);
        }
        return null;
    }
}
