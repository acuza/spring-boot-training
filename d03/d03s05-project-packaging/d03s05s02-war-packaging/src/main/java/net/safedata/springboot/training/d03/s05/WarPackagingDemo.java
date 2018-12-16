package net.safedata.springboot.training.d03.s05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * A small Spring Boot demo for packaging the app as a WAR (Web Archive) file.
 *
 * The {@link SpringBootServletInitializer} interface is used to initialize the Servlet context required by Tomcat
 *
 * @author bogdan.solga
 */
@SpringBootApplication
public class WarPackagingDemo extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WarPackagingDemo.class, args);
    }
}