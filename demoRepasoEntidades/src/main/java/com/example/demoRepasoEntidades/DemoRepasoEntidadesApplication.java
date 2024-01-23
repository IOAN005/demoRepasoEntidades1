package com.example.demoRepasoEntidades;

import com.example.demoRepasoEntidades.modelo.Barcos;
import com.example.demoRepasoEntidades.modelo.Patron;
import com.example.demoRepasoEntidades.modelo.Salidas;
import com.example.demoRepasoEntidades.modelo.Socios;
import com.example.demoRepasoEntidades.servicio.IPatronService;
import com.example.demoRepasoEntidades.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoRepasoEntidadesApplication implements CommandLineRunner {
	@Autowired
	private ISocioServicio servicio;
	@Autowired
	private IPatronService servicioPatron;

	public static void main(String[] args) {
		SpringApplication.run(DemoRepasoEntidadesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Socios s1 = new Socios("87654321B","Angelina Jolie","Los Angeles");
		Barcos b1 =new Barcos("1234ABC",20,"Titanic",300);
//		Barcos b2 = new Barcos("4321CBA",15,"Penelope Cruz",500);
//		b1.setSocio(s1);
//		b2.setSocio(s1);
//		List<Barcos> barcos=new ArrayList<>();
//		barcos.add(b1);
//		barcos.add(b2);
//		s1.setBarco(barcos);
//
//
//		System.out.println("--------INSERTAR DE UNO---------");
//		System.out.println(servicio.insertar(s1));
        System.out.println(servicio.monstraUno("87654321B"));
		Patron p1=new Patron("12345679A","Miguel Cervantes","Alcobendas");
		Salidas s1=new Salidas(5,LocalDate.now(), LocalTime.now(),b1);
		s1.setPatron(p1);
		Salidas s2=new Salidas(3,LocalDate.now(),LocalTime.now(),b1);
		s2.setPatron(p1);
		List<Salidas> salidas=new ArrayList<>();
		salidas.add(s1);
		salidas.add(s2);
		p1.setS1(salidas);
		System.out.println(servicioPatron.insertar(p1));
	}
}
