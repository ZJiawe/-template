package com.zhengjiawei.cn.domain.entitys;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <p>
 * 历史字段信息记录表
 * </p>
 *
 * @author ZhengJiaWei
 * @since 2019-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FieldHisInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 字段历史信息主键
     */
    @TableId
    private String infoId;

    /**
     * 版本主键
     */
    private String versionId;

    /**
     * 数据库主键
     */
    private String databaseId;

    /**
     * 表主键
     */
    private String tableId;

    /**
     * 字段主键
     */
    private String fieldId;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段类型
     */
    private String typeValue;

    /**
     * 字段长度
     */
    private String sizeValue;

    /**
     * 是否为主键
     */
    private Integer primaryKey;

    /**
     * 是否允许为空：0不允许为空，1允许为空
     */
    private Integer nullValue;

    /**
     * 是否自增
     */
    private Integer autoIncrement;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 字段说明
     */
    private String note;

    /**
     * 操作
     */
    private String action;

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
