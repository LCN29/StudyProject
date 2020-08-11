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
 * @date 2020-08-11 14:59
 */
@Data
@TableName(value = "customer_quote_group_relation")
public class CustomerQuoteGroupRelationDao {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户运费报价ID
     */
    private Integer custQuoId;

    /**
     * 客户分组ID
     */
    private Integer custGroupId;
}
