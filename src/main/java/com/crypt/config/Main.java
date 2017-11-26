package com.crypt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages="com.crypt.controller")
public class Main 
{
     public static void main(String[] args) 
     {
    	 System.out.println("Application Started!");
         SpringApplication.run(Main.class, args);
     }
}