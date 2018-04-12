package com.ifox.springbootspringsecurityjwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:38 2018/4/12
 * @Modified By:
 */
public class UsernameIsExitedException extends AuthenticationException {
    public UsernameIsExitedException(String msg, Throwable t) {
        super(msg, t);
    }

    public UsernameIsExitedException(String msg) {
        super(msg);
    }
}
