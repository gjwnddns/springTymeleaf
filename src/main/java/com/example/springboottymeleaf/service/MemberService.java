package com.example.springboottymeleaf.service;

import com.example.springboottymeleaf.mapper.MemberMapper;
import com.example.springboottymeleaf.vo.MemberVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private static final Logger log = LoggerFactory.getLogger(MemberService.class);
    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public void addMember(MemberVo memberVo) {
        log.error(memberVo.getId() + "hju1234");
        memberMapper.usersave(memberVo);
    }
}