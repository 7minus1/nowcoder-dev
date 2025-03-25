package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 声明增删改查的方法
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    // 增加用户
    int insertUser(User user);

    int updateStatus(int id, int status); // 返回的是修改的条数

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);


}
