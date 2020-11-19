package com.free.programmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title: FreeWebApplication
 * @author: wangcheng
 * @createTime 2020/9/28 0028
 * @content
 */
@SpringBootApplication
@ComponentScan
public class FreeWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(FreeWebApplication.class);
        System.err.println("--------------- 启动成功 ---------------");
    }
}
