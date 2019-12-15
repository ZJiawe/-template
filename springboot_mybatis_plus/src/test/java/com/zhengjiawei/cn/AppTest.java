package com.zhengjiawei.cn;

import com.zhengjiawei.cn.domain.entitys.VersionInfo;
import com.zhengjiawei.cn.domain.service.impl.DbHisInfoServiceImpl;
import com.zhengjiawei.cn.domain.service.impl.IndexFieldPresentInfoServiceImpl;
import com.zhengjiawei.cn.domain.service.impl.VersionInfoServiceImpl;
import com.zhengjiawei.cn.infrastructure.cfg.MybatisPlusConfig;
import com.zhengjiawei.cn.infrastructure.enums.StatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest
{
    @Autowired
    DbHisInfoServiceImpl dbHisInfoService;

    @Autowired
    IndexFieldPresentInfoServiceImpl indexFieldPresentInfoService;

    @Autowired
    VersionInfoServiceImpl versionInfoService;

    @Autowired
    MybatisPlusConfig ccccTest;


    @Test
    public void testInsert() {
        VersionInfo versionInfo = new VersionInfo()
                .setStatus(StatusEnum.valid)
                .setName("Hello");
        versionInfoService.save(versionInfo);
        System.out.println(versionInfo.getStatus());
        System.out.println(versionInfo.getVersion());
        System.out.println(versionInfo);
    }

    @Test
    public void testDelete() {
        VersionInfo versionInfo = new VersionInfo()
                .setStatus(StatusEnum.valid)
                .setName("del");
        versionInfoService.save(versionInfo);
        versionInfoService.removeById(versionInfo.getVersionId());
    }

    @Test
    public void searchById() {
        VersionInfo versionInfo = new VersionInfo()
                .setStatus(StatusEnum.valid)
                .setName("search");
        versionInfoService.save(versionInfo);
        versionInfo = versionInfoService.getById(versionInfo.getVersionId());
        System.out.println(versionInfo);
    }

    @Test
    public void updateVersionId() {
        VersionInfo versionInfo = new VersionInfo()
                .setStatus(StatusEnum.valid)
                .setName("save");
        versionInfoService.save(versionInfo);
        versionInfo = versionInfoService.getById(versionInfo.getVersionId());
        versionInfo.setName("Update");
        versionInfoService.updateById(versionInfo);
        Assert.assertEquals(new Integer(1), versionInfo.getVersion());
    }

}
