package com.github.hibernatedemo;

import com.github.hibernatedemo.models.simplemodels.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import javax.persistence.EntityManagerFactory;

@SpringBootApplication
public class HibernateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateDemoApplication.class, args);
    }

    @Bean(name = "vikash_student")
    public Student getVikash() {
        return new Student("Vikash", 59, "CSE");
    }

}
