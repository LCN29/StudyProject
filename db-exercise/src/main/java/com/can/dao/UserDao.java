package com.can.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-10 16:42
 */
@Data
public class UserDao {

    @TableId(value = "user_id")
    private Integer userId;

    private String userName;

    private Integer userAge;

    private Date birthday;
}
