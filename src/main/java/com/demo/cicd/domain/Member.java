package com.demo.cicd.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long memberId;
  private String email;
  private String password;
  private String name;
  private String nickName;
  private String sex;
}
