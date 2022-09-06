package com.github.rodolfo341.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.rodolfo341.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
