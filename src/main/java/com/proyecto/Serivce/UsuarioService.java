package com.proyecto.Serivce;

import java.util.List;
import java.util.Optional;

import com.proyecto.Entity.UsuarioE;

public interface UsuarioService {

	     List<UsuarioE> listausuarios();
		 
	     UsuarioE registroxeditausuario (UsuarioE usuarionew);
		
		 Optional<UsuarioE>buscaxid(Long idusuario);
		 
		 void eliminausuarioxid(Long idusuario);
		 
		 //validar para dato unico
		 boolean existePorUsuarioUsu(String usuarioUsu);
		 
		 boolean existePorCorreoUsuario(String correoUsuario);
		 //
}
