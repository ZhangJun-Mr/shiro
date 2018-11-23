package com.shiro.cas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("a")
public class ShiroController {

    @RequestMapping("success")
    public String success(){
        return "success";
    }

}
