package com.github.rodolfo341.service;

import java.util.List;

import com.github.rodolfo341.entity.Mascota;

public interface MascotaService {
	public List<Mascota> listAllMascotas();
	public Mascota saveMascota(Mascota mascota);
	public Mascota obtenerMascotaPorId(Long id);	
	public Mascota actualizarMascota(Mascota mascota);	
	public void eliminarMascota(Long id);
}
