package com.zhengjiawei.cn.domain.entitys;

import com.baomidou.mybatisplus.annotation.*;
import com.zhengjiawei.cn.infrastructure.enums.StatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <p>
 * 版本记录表
 * </p>
 *
 * @author ZhengJiaWei
 * @since 2019-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VersionInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 版本主键
     */
    @TableId
    private String versionId;

    /**
     * 版本名称
     */
    private String name;

    /**
     * 版本说明
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
    @TableField(fill = FieldFill.INSERT)
    private Integer active;

    /**
     * 同一个应用，一个版本开放，其余关闭
     */
    @EnumValue
    private StatusEnum status;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * hibernate乐观锁使用
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;


}
