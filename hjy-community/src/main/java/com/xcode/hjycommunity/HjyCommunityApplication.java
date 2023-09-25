package com.xcode.hjycommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xcode.hjycommunity.**.mapper")
public class HjyCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(HjyCommunityApplication.class, args);

        System.out.println("專案啟動成功");

    }

}
