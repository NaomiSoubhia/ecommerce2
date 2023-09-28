package com.github.naomisoubhia.ecommerce.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

@RestController
@RequestMapping
public class PingController {
	

	 @Autowired
	    private Environment environment;

	    @GetMapping("/ping")
	    public String ping() {
	        String mensagem = environment.getProperty("mensagem");
	        return "ping pong: " + mensagem;
	    }

}
