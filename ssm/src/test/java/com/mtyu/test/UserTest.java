package com.mtyu.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mtyu.pojo.User;
import com.mtyu.service.DictValService;
import com.mtyu.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {

    @Autowired
    private UserService userService;
    @Autowired
    private DictValService dictValBiz;

    @Test
    public void Test() {
        Assert.assertNotNull(userService);
        User user = userService.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void TestAdd() {
        User obj = new User();
        obj.setUserName("梦田鱼");
        obj.setPassword("123test");
        userService.addUser(obj);
        System.out.println(obj.getUserId());
    }

    @Test
    public void TestDict() {
        User obj = new User();
        obj.setUserId(1);
        obj = userService.getUserById(obj.getUserId());

    }

    @Test
    public void TestgetUserMap() {
        User obj = new User();
        obj.setUserId(1);
        obj = userService.getUserById(obj.getUserId());

    }

    @Test
	public void testGetUserCount() {
	    Map<String, String> map = new HashMap<String, String>();
	    map.put("userId", "1");
	    map.put("userName", "梦");
	    Long userCount = userService.getUserCount(map);
	    System.out.println(userCount);
	    
	}
}
