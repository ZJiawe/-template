package com.zhengjiawei.cn.infrastructure.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Auther: MrZheng
 * @Date: 2019/12/15 12:41
 * @Description:
 */
public enum StatusEnum implements IEnum<Integer> {

    /**
     * 有效
     */
    invalid,
    /**
     * 无效
     */
    valid;

    @Override
    public Integer getValue() {
        return this.ordinal();
    }
}
