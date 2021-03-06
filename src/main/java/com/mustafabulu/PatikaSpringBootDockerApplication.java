package com.mustafabulu;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;




//security dahil etmemeeekkk icin
@SpringBootApplication(exclude =
        {
                org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
                org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
        }
)

@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@Log4j2
public class PatikaSpringBootDockerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(PatikaSpringBootDockerApplication.class, args);
    }



}
