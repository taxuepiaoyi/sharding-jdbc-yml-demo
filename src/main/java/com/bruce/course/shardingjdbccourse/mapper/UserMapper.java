package com.bruce.course.shardingjdbccourse.mapper;

import com.bruce.course.shardingjdbccourse.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserEntity> queryAllUser() ;
}
