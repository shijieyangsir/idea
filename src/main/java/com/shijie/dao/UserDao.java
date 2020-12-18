package com.shijie.dao;

import com.shijie.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

}
