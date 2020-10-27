package com.boot.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.boot.example.MybatisApplication
 *
 * @author lipeng
 * @date 2019/11/9 下午9:46w
 */
@SpringBootApplication
@MapperScan(basePackages = "com.boot.example.mapper")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
