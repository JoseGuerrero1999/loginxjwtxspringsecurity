package com.proyecto.Repoistory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.Entity.UsuarioE;


@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioE, Long> {

	// dato unique 
	
	  boolean existsByUsuarioUsu(String usuarioUsu);
	  boolean existsByCorreoUsuario(String correoUsuario);
	  //    
	    
	Optional<UsuarioE> findByUsuarioUsu(String usuarioUsu);
	
}
