package com.zhengjiawei.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author  ZhengJiaWei
 */
@SpringBootApplication
@MapperScan("com.zhengjiawei.cn.domain.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
