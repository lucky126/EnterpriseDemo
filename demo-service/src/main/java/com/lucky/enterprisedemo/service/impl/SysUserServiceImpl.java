package com.lucky.enterprisedemo.service.impl;

import com.lucky.enterprisedemo.mapper.SysUserMapper;
import com.lucky.enterprisedemo.pojo.SysUser;
import com.lucky.enterprisedemo.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lucky on 2017/3/21.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser getById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
