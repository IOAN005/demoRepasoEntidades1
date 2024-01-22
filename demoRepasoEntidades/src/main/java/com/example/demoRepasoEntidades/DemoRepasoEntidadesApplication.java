package com.example.demoRepasoEntidades;

import com.example.demoRepasoEntidades.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRepasoEntidadesApplication implements CommandLineRunner {
	@Autowired
	private ISocioServicio servicio;

	public static void main(String[] args) {
		SpringApplication.run(DemoRepasoEntidadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(servicio.monstraUno("12345678A"));

	}
}
