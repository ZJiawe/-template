package com.zhengjiawei.cn.domain.service.impl;

import com.zhengjiawei.cn.domain.entitys.VersionInfo;
import com.zhengjiawei.cn.domain.mapper.VersionInfoMapper;
import com.zhengjiawei.cn.domain.service.interfaces.VersionInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本记录表 服务实现类
 * </p>
 *
 * @author ZhengJiaWei
 * @since 2019-12-15
 */
@Service
public class VersionInfoServiceImpl extends ServiceImpl<VersionInfoMapper, VersionInfo> implements VersionInfoService {

}
