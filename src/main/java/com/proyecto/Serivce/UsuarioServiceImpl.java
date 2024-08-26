package com.proyecto.Serivce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.Entity.UsuarioE;
import com.proyecto.Repoistory.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usurepo;

	@Override
	public List<UsuarioE> listausuarios() {	
		return usurepo.findAll();
	}

	@Override
	public UsuarioE registroxeditausuario(UsuarioE usuarionew) {    
		return usurepo.save(usuarionew);
	}

	@Override
	public Optional<UsuarioE> buscaxid(Long idusuario) {
		return usurepo.findById(idusuario);
	}

	@Override
	public void eliminausuarioxid(Long idusuario) {
		usurepo.deleteById(idusuario);
	}

	@Override
	public boolean existePorUsuarioUsu(String usuarioUsu) {
		// TODO Auto-generated method stub
		return usurepo.existsByUsuarioUsu(usuarioUsu);
	}

	@Override
	public boolean existePorCorreoUsuario(String correoUsuario) {
		// TODO Auto-generated method stub
		return usurepo.existsByCorreoUsuario(correoUsuario);
	}
	   
}
