package com.dai.collector;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @date 2021-05-10
 * <h1>项目启动类</h1>
 */
@SpringBootApplication
@Slf4j
public class CollectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectorApplication.class, args);
        log.info("海量日志收集系统启动成功");
    }

}
