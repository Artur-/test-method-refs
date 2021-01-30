package com.example.application;

import com.example.application.views.helloworld.HelloWorldView;
import com.github.hervian.reflection.Fun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {

        System.out.println("Method HelloWorldView::getAlignItems is " + Fun.toMethod(HelloWorldView::getAlignItems));
        System.out.println("Lambda is " + Fun.toMethod(() -> System.out.println("hello")));
        // LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class,
        // args));
    }

}
