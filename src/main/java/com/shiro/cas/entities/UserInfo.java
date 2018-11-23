package com.shiro.cas.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserInfo {
    String id = "1";
    String username = "zhangsan";
    String password = "123456";
    List<SysRole> roleList  = new ArrayList<>();
}
