package com.can.web;

import com.can.dao.UserDao;
import com.can.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-10 16:26
 */
@Slf4j
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{userId}")
    public UserDao getUser(@PathVariable(name = "userId") Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/add")
    public int insert() {
        return userService.insertUser();
    }
}
