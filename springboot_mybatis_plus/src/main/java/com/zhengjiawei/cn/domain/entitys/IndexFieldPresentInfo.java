package com.zhengjiawei.cn.domain.entitys;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 当前索引字段联系表
 * </p>
 *
 * @author ZhengJiaWei
 * @since 2019-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IndexFieldPresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 字段主键
     */
    private String fieldId;

    /**
     * 索引主键
     */
    @TableId
    private String indexId;

    /**
     * 字段长度
     */
    private Integer lengthValue;

    /**
     * 是否降序: 0为升序，1为降序
     */
    private Integer decline;

    /**
     * 索引字段位置
     */
    private Integer position;

    /**
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;


}
