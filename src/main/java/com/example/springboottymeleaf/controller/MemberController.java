package com.example.springboottymeleaf.controller;

import com.example.springboottymeleaf.service.MemberService;
import com.example.springboottymeleaf.vo.MemberVo;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signUp/do")
    public void signup(@RequestParam Map<String, String> signupForm) {
        MemberVo memberVo = new MemberVo(signupForm.get("id"), signupForm.get("password"));
        memberService.addMember(memberVo);
    }
}