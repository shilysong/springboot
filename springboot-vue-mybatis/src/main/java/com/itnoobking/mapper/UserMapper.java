package com.itnoobking.mapper;

import com.itnoobking.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
    /**
     * 根据id查询
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 更新
     * @param user
     */

    void updateUser(User user);

    /**
     * 新增用户信息
     * @param user
     */
    void insertUser(User user);
    /**
     * 批量删除用户信息
     * @param id
     */
    void deleteUsersById(Integer id);
}
