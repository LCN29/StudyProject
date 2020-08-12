package com.can.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-08-12 10:26
 */
@Data
@TableName(value = "t_user_extend")
public class UserExtendDao {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
}
