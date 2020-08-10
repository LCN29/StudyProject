package com.can.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.can.dao.UserDao;
import com.can.mapper.UserMapper;
import com.can.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-10 16:27
 */

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDao> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String getString() {
        return "0k";
    }

    @Override
    public UserDao getUserById(Integer userId) {
        log.info("id---->{}", userId);
        UserDao userByUserId = userMapper.getUserByUserId(userId);
        UserDao result = super.getOne(new QueryWrapper<UserDao>().lambda().eq(UserDao::getUserName, "测试"));
        return result;
    }
}
