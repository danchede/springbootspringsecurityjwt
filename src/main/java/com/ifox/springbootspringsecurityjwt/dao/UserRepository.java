package com.ifox.springbootspringsecurityjwt.dao;

import com.ifox.springbootspringsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:34 2018/4/12
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUsername(String username);

}
