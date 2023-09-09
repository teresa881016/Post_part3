package com.sparta.level3.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{4,10}", message = "아이디 4~10자 영문 소문자, 숫자를 사용하세요.")
    private String username;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp = "^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{8,15}+$", message = "비밀번호는 8~15자 영문 대 소문자, 숫자를 사용하세요.")
    private String password;
    //"^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{8,15}+$"
    //"(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,15}"
    //https://adjh54.tistory.com/104#1.%20%EB%AC%B8%EC%9E%90%20%ED%81%B4%EB%9E%98%EC%8A%A4%EB%A5%BC%20%EC%9D%B4%EC%9A%A9(%5C%5Cw%2C%20%5C%5CW)%20-%20%EB%AC%B8%EC%9E%90%EC%97%B4%EC%97%90%20%EB%8C%80%ED%95%9C%20%EC%A0%95%EA%B7%9C%EC%8B%9D%20%EC%88%98%ED%96%89-1


    private  boolean admin = false;
    private String adminToken = "";
}

