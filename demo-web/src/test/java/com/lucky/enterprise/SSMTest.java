package com.lucky.enterprise;

import com.lucky.enterprisedemo.pojo.SysUser;
import com.lucky.enterprisedemo.service.SysUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * Created by sl982 on 2017-03-21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Resource
    private SysUserService sysUserService;

    @Test
    public void test1() {
        SysUser sysUser = sysUserService.getById(1L);
        logger.info("--------------------------------" + sysUser.toString());
    }
}