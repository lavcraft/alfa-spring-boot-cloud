package ru.alfa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired MyService myService;

    @PostConstruct
    public void init() {
        myService.doSth();
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        System.out.println(run.getBeanDefinitionNames());

    }
}
