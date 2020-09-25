package com.itnoobking.mapper;

import com.itnoobking.pojo.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();
}
