package com.zhengjiawei.cn;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.zhengjiawei.cn.infrastructure.genertor.config.MyTypeConvert;
import org.junit.Test;


/**
 * @Auther: MrZheng
 * @Date: 2019/12/14 11:33
 * @Description:
 */
public class CodeGenerateTest {

    @Test
    public void generateTest() {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        // 是否支持AR模式
        config.setActiveRecord(false)
                // 作者
                .setAuthor("ZhengJiaWei")
                // 生成路径
                .setOutputDir("D:\\2.WorkSpace\\5.template\\springboot_mybatis_plus\\src\\main\\java")
                // 文件覆盖
                .setFileOverride(true)
                // 设置生成的service接口的名字的首字母是否为I
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true);

        //2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        // 设置数据库类型
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
//                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/dbmange?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC")
                .setUsername("root")
                .setPassword("123456")
                .setTypeConvert(new MyTypeConvert());

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) // 全局大写命名
                // 数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                // 字段映射到实体的命名策略
                .setColumnNaming(NamingStrategy.underline_to_camel)
                // 映射表前缀
//                .setTablePrefix("tbl_")
                // 生成的指定的表 注释掉则代表全部表生成
//                .setInclude("table_name)
                // 乐观锁字段
                .setVersionFieldName("version")
                // 逻辑删除字段
                .setLogicDeleteFieldName("active")
                // RestFul风格控制器
                .setRestControllerStyle(true)
                // Boolean类型字段需不需要除去IS前缀
                .setEntityBooleanColumnRemoveIsPrefix(true)
                // 是否为lombok模型
                .setEntityLombokModel(true);

        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.zhengjiawei.cn")
                .setMapper("domain.mapper")
                .setService("domain.service.interfaces")
                .setController("interfaces.controller")
                .setEntity("domain.entitys")
                .setXml("domain.mapper")
                .setServiceImpl("domain.service.impl");

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();

        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();
    }
}
