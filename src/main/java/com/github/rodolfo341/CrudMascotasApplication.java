package com.github.rodolfo341;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.rodolfo341.entity.Mascota;
import com.github.rodolfo341.repository.MascotaRepository;

@SpringBootApplication
public class CrudMascotasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudMascotasApplication.class, args);
	}
	
	@Autowired
	private MascotaRepository mascotaRepository;

	@Override
	public void run(String... args) throws Exception {
//		Mascota mascota1 = new Mascota("Manchas", "perro", 10);
//		mascotaRepository.save(mascota1);
//		
//		Mascota mascota2 = new Mascota("Jerry", "raton", 2);
//		mascotaRepository.save(mascota2);		
		
	}

}
