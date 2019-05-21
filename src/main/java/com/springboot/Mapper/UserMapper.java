package com.springboot.Mapper;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where userName=#{userName} and realName=#{realName}")
    User Login(@Param("userName") String userName, @Param("realName") String realName);

  /*  @Results(id = "userMapper" ,value = {
            @Result(id=true,column = "userId",property = "userId"),
            @Result(column = "userName",property = "userName")
    })*/
    @Select("select * from user")
    List<User> getUser();
    @Delete("delete from user where userId =#{userId}")
    void deleteUser(Integer userId);

    @Update("update user set userPhone=#{userPhone},userAddress=#{userAddress},realName=#{realName},userSex=#{userSex},mooto=#{mooto}" +
            " where userId=#{userId}")
    void updateUserById(User user);

    @Select("select * from user where userId=#{userId}")
    User selectUserById(Integer userId);

    @Options(useGeneratedKeys = true,keyColumn = "userId",keyProperty = "userId")
    @Insert("insert into user value(#{userName},#{userPhone})")
    void  addUser(User user);
}
