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
 * 当前表信息记录表
 * </p>
 *
 * @author ZhengJiaWei
 * @since 2019-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TablePresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 表主键
     */
    @TableId
    private String tableId;

    /**
     * 数据库主键
     */
    private String databaseId;

    /**
     * 表名称
     */
    private String name;

    /**
     * 表编码
     */
    private String code;

    /**
     * 表引擎
     */
    private String engine;

    /**
     * 表说明
     */
    private String note;

    /**
     * 状态:有效,无效,伪删除
     */
    @TableLogic
    private Integer active;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Timestamp modificationTime;

    /**
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;


}
