package com.project.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
public class CommonResult {

    private boolean success;
    private int code;
    private String msg;
}