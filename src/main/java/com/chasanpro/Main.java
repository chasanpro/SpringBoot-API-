package com.chasanpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
@GetMapping("/")
public   Greetresponse greet(){
        return new Greetresponse("HEllo Chaitanya");

}
    record  Greetresponse(String something){}
}
