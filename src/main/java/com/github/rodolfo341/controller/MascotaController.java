package com.github.rodolfo341.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.rodolfo341.service.MascotaService;

@Controller
public class MascotaController {
	@Autowired
	private MascotaService mascotaService;
	
	@GetMapping({"","/","/mascotas"})
	public String listAllMAscotas(Model model) {
		model.addAttribute("mascotas",mascotaService.listAllMascotas());
		return "mascotas";
	}
	
}
