package com.zhengjiawei.cn.domain.entitys;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <p>
 * 当前索引信息记录表
 * </p>
 *
 * @author ZhengJiaWei
 * @since 2019-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IndexPresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 索引主键
     */
    @TableId
    private String indexId;

    /**
     * 数据库主键
     */
    private String databaseId;

    /**
     * 表主键
     */
    private String tableId;

    /**
     * 索引名称
     */
    private String name;

    /**
     * 索引类型
     */
    private Integer typeValue;

    /**
     * 索引说明
     */
    private String note;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Timestamp modificationTime;

    /**
     * 状态:有效,无效,伪删除
     */
    @TableLogic
    private Integer active;

    /**
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;


}
