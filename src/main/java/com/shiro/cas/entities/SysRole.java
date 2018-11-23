package com.shiro.cas.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SysRole {
    private String id = "1";
    private String role = "user";
    private List<SysPermission> permissions = new ArrayList<>();
}
