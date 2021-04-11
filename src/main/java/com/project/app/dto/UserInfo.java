package com.project.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Getter
@Setter
@ToString
@Slf4j
public class UserInfo {

    private int id;
    private String userName;
    private String passWord;

    public UserInfo(int id, String userName, String passWord){
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

}
