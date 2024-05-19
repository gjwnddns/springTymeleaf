package com.example.springboottymeleaf.mapper;

import com.example.springboottymeleaf.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    void usersave(@Param("mem") MemberVo memberVo);
}