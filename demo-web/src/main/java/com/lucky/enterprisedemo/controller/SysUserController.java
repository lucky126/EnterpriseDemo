package com.lucky.enterprisedemo.controller;


import com.lucky.enterprisedemo.pojo.SysUser;
import com.lucky.enterprisedemo.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
/**
 * Created by sl982 on 2017-03-21.
 */
@Controller
@RequestMapping("/sysUserController")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/showUserToJspById/{userId}")
    public String showUser(Model model, @PathVariable("userId") Long userId){
        SysUser user = this.sysUserService.getById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/showUserToJSONById/{userId}")
    @ResponseBody
    public SysUser showUser(@PathVariable("userId") Long userId){
        SysUser user = sysUserService.getById(userId);
        return user;
    }

}