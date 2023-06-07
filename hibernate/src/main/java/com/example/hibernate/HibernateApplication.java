package com.example.hibernate;

import com.example.hibernate.model.Autobus;
import com.example.hibernate.repo.IAutobusRepo;
import com.example.hibernate.service.AutobusService;
import com.example.hibernate.service.IAutobusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HibernateApplication {
	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}
}
