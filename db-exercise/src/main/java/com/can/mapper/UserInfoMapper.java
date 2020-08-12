package com.can.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.can.dao.UserInfoDao;

import javax.websocket.server.PathParam;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-10 16:28
 */
public interface UserInfoMapper extends BaseMapper<UserInfoDao>{

    /**
     * 通过用户 id 查询信息
     * @param userId
     * @return
     */
    UserInfoDao getUserByUserId(@PathParam("userId") Integer userId);

}
