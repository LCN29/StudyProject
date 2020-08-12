package com.can.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.can.dao.UserExtendDao;
import com.can.mapper.UserExtendMapper;
import com.can.service.UserExtendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-12 11:39
 */
@Service
public class UserExtendServiceImpl extends ServiceImpl<UserExtendMapper, UserExtendDao> implements UserExtendService  {

    @Resource
    private UserExtendMapper userExtendMapper;

    @Override
    public int insert(UserExtendDao userExtendDao) {
        return insert2(userExtendDao);
    }

    private int insert2(UserExtendDao userExtendDao) {
        return userExtendMapper.insert(userExtendDao);
    }
}
