package de.marcusjanke.examples.spring.boot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApp {

    private static Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MyApp.class, args);
        MyBean myBean = ctx.getBean(MyBean.class);
        logger.info("Hello {}", myBean.getName());
    }
}