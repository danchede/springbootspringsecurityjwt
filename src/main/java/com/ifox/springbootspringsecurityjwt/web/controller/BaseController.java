package com.ifox.springbootspringsecurityjwt.web.controller;

import com.ifox.springbootspringsecurityjwt.dao.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in17:09 2018/6/8
 * @Modified By:
 */

public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    protected UserRepository userRepository;

    /**
     * 获取用户所拥有的权限列表
     * @return
     */
    public List<String> getAuthentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> list = new ArrayList<>();
        for (GrantedAuthority grantedAuthority : authorities) {
            logger.info("权限列表：{}", grantedAuthority.getAuthority());
            list.add(grantedAuthority.getAuthority());
        }
        return list;
    }
}
