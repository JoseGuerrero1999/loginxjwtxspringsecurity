package com.proyecto.Repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.Entity.RolE;



@Repository
public interface RolRepository extends JpaRepository<RolE, Long> {
	
        RolE findByNombreRol(String nombreRol);

}
