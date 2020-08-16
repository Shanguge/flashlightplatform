package com.shanguge.platform.flashlight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class FlashlightApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashlightApplication.class, args);
    }

}
