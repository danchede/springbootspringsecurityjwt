package com.ifox.springbootspringsecurityjwt.web.param;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in17:16 2018/6/8
 * @Modified By:
 */
public class LoginParam {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
