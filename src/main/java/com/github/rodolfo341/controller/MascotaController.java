package com.github.rodolfo341.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.rodolfo341.entity.Mascota;
import com.github.rodolfo341.service.MascotaService;

@Controller
public class MascotaController {
	@Autowired
	private MascotaService mascotaService;
	
	@GetMapping({"","/","/mascotas"})
	public String listDeMAscotas(Model model) {
		model.addAttribute("listaMascotas",mascotaService.listAllMascotas());
		return "/mascotas";
	}
	
	@GetMapping("/mascotas/nuevo")
	public String crearMascotaFormulario(Model model) {
		Mascota mascota = new Mascota();
		model.addAttribute("mascota",mascota);
		return "crear_mascota";
	}
	
}
