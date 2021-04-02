package kr.or.connect.preworkproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"kr.or.connect.preworkprojcet.dao"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
