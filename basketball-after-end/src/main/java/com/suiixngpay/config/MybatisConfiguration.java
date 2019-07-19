package com.suiixngpay.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.suiixngpay.mapper")
public class MybatisConfiguration {
}
