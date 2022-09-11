package com.github.rodolfo341.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/mascotas")
	public String saveMascota(@ModelAttribute("mascotas") Mascota mascota) {
		mascotaService.saveMascota(mascota);
		return "redirect:/mascotas";
	}
	
	@GetMapping("/mascotas/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model model) {
	model.addAttribute("mascota", mascotaService.obtenerMascotaPorId(id));
	return "editar_mascota";
	}
	
	@PostMapping("/mascota/{id}")
	public String actualizarMascota(@PathVariable Long id, @ModelAttribute("mascota") Mascota mascota, Model model) {
		Mascota mascotaExistente = mascotaService.obtenerMascotaPorId(id);
		mascotaExistente.setId(id);
		mascotaExistente.setNombre(mascota.getNombre());
		mascotaExistente.setRaza(mascota.getRaza());
		mascotaExistente.setEdad(mascota.getEdad());
		mascotaService.actualizarMascota(mascotaExistente);		
		return "Redirect:/mascotas";
	}
	
	@GetMapping("/mascotas/{id}")
	public String eliminarMascota(@PathVariable Long id) {
		mascotaService.eliminarMascota(id);
		return "redirect:/mascotas";
	}
	
}
