package com.can.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

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
public class UserInfoDao {

    @TableId(value = "user_id", type= IdType.AUTO)
    private Integer userId;

    private String userName;

    private Integer userAge;

    private LocalDate birthday;
}
