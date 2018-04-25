package com.mtyu.controller;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mtyu.pojo.User;
import com.mtyu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userlist", method = RequestMethod.POST)
    public String getUser(@RequestParam("userId") Integer userId, Model model) {
        log.debug("In getUser userId = {}", userId);
        User user = this.userService.getUserById(userId);
        model.addAttribute(user);
        return "userlist";
    }

    @RequestMapping(value = "/alluserlist", method = RequestMethod.POST)
    public String getUserList(@RequestParam("userName") String userName, Map<String, Object> model) {
        log.debug("In getUserList userName = {}", userName);
        List<User> userList = this.userService.getUserList(userName);

        model.put("users", userList);
        return "userlist";
    }

    /**
     * user的分页查询页面
     * 
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectuser", method = RequestMethod.POST)
    public String selectUser(HttpServletRequest request, Map<String, Object> model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", request.getParameter("userId"));
        map.put("userName", request.getParameter("userName"));
        map.put("password", request.getParameter("password"));
        map.put("age", request.getParameter("age"));
        map.put("sex", request.getParameter("sex"));
        System.out.println(map.toString());

        Long userCount = this.userService.getUserCount(map);
        model.put("userCount", userCount);
        for (Entry<String, String> e : map.entrySet()) {
            model.put(e.getKey().toString(), e.getValue());
        }
        System.out.println(model.toString());
        return "userlist";
    }

    @RequestMapping(value = "/usermap", method = RequestMethod.POST)
    public String getUserMap(@RequestParam("userId") Integer userId, Map<String, Object> model) {
        log.debug("In getUserMap userId = {}", userId);
        User user = this.userService.getUserById(userId);
        if (user == null) {
            log.info("user is null");
            return "userlist";
        }
        Field[] fields = user.getClass().getDeclaredFields();
        try {
            for (Field f : fields) {
                model.put(f.getName(), f.get(null));
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        log.info(model.toString());
        return "userlist";
    }
}
