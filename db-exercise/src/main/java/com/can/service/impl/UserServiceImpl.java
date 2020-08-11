package com.can.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.can.dao.CustomerQuoteGroupRelationDao;
import com.can.dao.UserDao;
import com.can.mapper.CustomerQuoteGroupRelationMapper;
import com.can.mapper.UserMapper;
import com.can.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Objects;

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

    @Resource
    private CustomerQuoteGroupRelationMapper customerQuoteGroupRelationMapper;

    @Override
    public UserDao getUserById(Integer userId) {

        log.info("请求参数----------->{}", userId);

        UserDao result = super.getOne(new QueryWrapper<UserDao>().lambda().eq(UserDao::getUserName, "测试"));

        if (Objects.isNull(result)) {
            result = userMapper.getUserByUserId(userId);
        }
        return result;
    }

    @Override
    public int insertUser() {
        UserDao userDao = new UserDao();
        userDao.setBirthday(new Date());
        userDao.setUserName("ooo");
        userDao.setUserAge(123);
        int insert = userMapper.insert(userDao);
        return insert;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean updateData(Integer id) {

        UserDao user = new UserDao();
        user.setUserName("名字2");
        this.userMapper.update(user, new QueryWrapper<UserDao>().lambda().eq(UserDao::getUserId, 1));

        CustomerQuoteGroupRelationDao dao = new CustomerQuoteGroupRelationDao();
        dao.setCustGroupId(12);
        dao.setCustQuoId(12);

        customerQuoteGroupRelationMapper.insert(dao);
        return Boolean.TRUE;
    }
}
