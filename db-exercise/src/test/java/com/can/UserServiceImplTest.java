package com.can;

import com.can.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-12 10:31
 */
@SpringBootTest
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void test() {
        userService.insertUser();
    }
}
