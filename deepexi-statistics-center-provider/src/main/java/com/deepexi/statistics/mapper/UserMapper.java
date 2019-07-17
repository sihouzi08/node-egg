package com.deepexi.statistics.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.statistics.domain.eo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  UserMapper extends BaseMapper<User> {

    List<User> findList(@Param("eo")  User eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}