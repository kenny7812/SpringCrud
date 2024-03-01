package com.crud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.crud.demo.modelo") // Ajusta este paquete según tu configuración
public class SpringCrudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCrudApplication.class, args);
    }
}

