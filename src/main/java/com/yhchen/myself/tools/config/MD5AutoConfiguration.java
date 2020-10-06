package com.yhchen.myself.tools.config;

import com.yhchen.myself.tools.service.Md5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/10/6
 */
@Configuration
public class MD5AutoConfiguration {
    @Bean
    Md5Service md5Service() {
        return new Md5Service();
    }
}
