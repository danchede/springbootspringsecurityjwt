package com.ifox.springbootspringsecurityjwt.web.controller;

import com.ifox.springbootspringsecurityjwt.dao.UserRepository;
import com.ifox.springbootspringsecurityjwt.entity.User;
import com.ifox.springbootspringsecurityjwt.exception.UsernameIsExitedException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:47 2018/4/12
 * @Modified By:
 */
@RestController
@RequestMapping("/users")
@Api(value = "用户管理", description = "用户管理")
public class UserController  extends BaseController{

    /**
     * 获取用户列表
     * @return
     */
    @ApiOperation(value = "查询用户列表")
    @GetMapping("/userList")
    public Map<String, Object> userList(){
        List<User> users = userRepository.findAll();
        logger.info("users: {}", users);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("users",users);
        return map;
    }

    @ApiOperation(value = "查询用户权限")
    @GetMapping("/authorityList")
    public List<String> authorityList(){
        List<String> authentication = getAuthentication();
        return authentication;
    }


}
