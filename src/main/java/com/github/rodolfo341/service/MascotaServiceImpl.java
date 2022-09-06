package com.github.rodolfo341.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.rodolfo341.entity.Mascota;
import com.github.rodolfo341.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	private MascotaRepository mascotaRepository; 
	
	@Override
	public List<Mascota> listAllMascotas() {
		return mascotaRepository.findAll();
	}

}
