package com.can.service;

import com.can.dao.UserDao;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-10 16:27
 */
public interface UserService {

    /**
     * 通过 id 查询客户信息
     *
     * @param userId
     * @return
     */
    UserDao getUserById(Integer userId);

    int insertUser();

    Boolean updateData(Integer id);
}
