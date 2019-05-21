package com.springboot.Mapper;

import com.springboot.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    @Select("select *  from admin")
    List<Admin> findAdmin();
}
