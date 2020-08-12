package com.can.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.can.dao.UserExtendDao;
import com.can.dao.UserInfoDao;
import com.can.mapper.UserExtendMapper;
import com.can.mapper.UserInfoMapper;
import com.can.service.UserExtendService;
import com.can.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;

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
public class UserServiceImpl extends ServiceImpl<UserInfoMapper, UserInfoDao> implements UserService {

    @Resource
    private UserInfoMapper userMapper;

    @Resource
    private UserExtendMapper userExtendMapper;

    @Resource
    private UserExtendService userExtendService;

    @Override
    public UserInfoDao getUserById(Integer userId) {

        UserInfoDao result = super.getOne(new QueryWrapper<UserInfoDao>().lambda().eq(UserInfoDao::getUserName, "测试"));
        return result;
    }

    @Override
    public int insertUser() {

        insertUserInfo();
        return 1;
    }

    public void insertExtend() {
        UserExtendDao userExtendDao = new UserExtendDao();
        userExtendDao.setName("extend");
        int insert = userExtendMapper.insert(userExtendDao);
        if (insert == 1) {
            throw new RuntimeException("fail");
        }
        return;
    }


    private void insertUserInfo() {
        UserInfoDao userInfoDao = new UserInfoDao();
        userInfoDao.setBirthday(LocalDate.now());
        userInfoDao.setUserName("ooo");
        userInfoDao.setUserAge(123);
        int insert = userMapper.insert(userInfoDao);
        if (insert != 1) {
            throw new RuntimeException("fail");
        }


        UserExtendDao userExtendDao = new UserExtendDao();
        userExtendDao.setName("extend");
        int insert1 = userExtendService.insert(userExtendDao);

        return;

    }

}
