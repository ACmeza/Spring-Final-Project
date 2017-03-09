package config;

import config.PersistenceContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by antonio on 01/03/17.
 */
@Configuration
@Import(PersistenceContext.class)  //Import config class from spring-data
@ComponentScan(basePackages = "org.accenture.service")
public class ServiceContext {

}