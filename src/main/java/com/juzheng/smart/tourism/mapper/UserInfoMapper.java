package com.juzheng.smart.tourism.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.juzheng.smart.tourism.entity.UserInfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}