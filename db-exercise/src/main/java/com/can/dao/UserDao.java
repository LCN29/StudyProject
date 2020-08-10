package com.can.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName(value = "t_user_info")
public class UserDao {

    @TableId(value = "user_id")
    private Integer userId;

    private String userName;

    private Integer userAge;

    private Date birthday;
}
