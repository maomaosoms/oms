package com.mtyu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mtyu.dao.UserDao;
import com.mtyu.pojo.User;

/**
 * user的业务逻辑，使用注解进行事务管理
 * 
 * @author K-HItmaN
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public Long getUserCount(Map<String, String> map) {
        return userDao.getUserCount(map);
    }

    public List<User> selectUserByPage(Integer startPos, Integer pageSize, User user) {
        return userDao.selectUserByPage(startPos, pageSize, user);
    }

    public List<User> getUserList(String userName) {
        return userDao.getUserList(userName);
    }

    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Transactional
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Transactional
    public int editUser(User user) {
        return userDao.editUser(user);
    }

    @Transactional
    public int delUser(User user) {
        return userDao.delUser(user);
    }

}
