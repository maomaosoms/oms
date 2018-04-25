package com.mtyu.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mtyu.pojo.User;

public interface UserService {
    /**
     * 根据查询条件获得总数
     * 
     * @param user
     * @return
     */
    Long getUserCount(Map<String, String> map);

    /**
     * 根据分页和查询条件查询用户
     * 
     * @param user
     * @return
     */
    List<User> selectUserByPage(@Param(value = "startPos") Integer startPos,
            @Param(value = "pageSize") Integer pageSize, @Param("user") User user);

    /**
     * 根据用户名获取所有user
     * 
     * @param userName
     * @return
     */
    List<User> getUserList(@Param("userName") String userName);

    /**
     * 根据ID获取USER
     * 
     * @param userId
     * @return
     */
    User getUserById(Integer userId);

    /**
     * 新增用户,新增后可以获得userId
     * 
     * @param user
     * @return 新增数量
     */
    int addUser(User user);

    /**
     * 修改用户
     * 
     * @param user
     * @return
     */
    int editUser(User user);

    /**
     * 删除用户
     * 
     * @param user
     * @return
     */
    int delUser(User user);
}
