package com.ifox.springbootspringsecurityjwt.exception;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:37 2018/4/12
 * @Modified By:
 */
public class TokenException extends BaseException {
    private static final long serialVersionUID = 1L;

    public TokenException(String message) {
        super(message);
    }

}
