package com.demo.cicd.controller;

import com.demo.cicd.domain.Member;
import com.demo.cicd.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final MemberRepository memberRepository;

  @PostMapping("/health-check")
  public String health(){
    return "health-server";
  }

  @PostMapping("/health-check")
  public Member login(){
    return memberRepository.save(Member.builder()
        .sex("남성")
        .email("test@gmail.com")
        .password("testPassword")
        .nickName("testUser")
        .build()
    );
  }

}
