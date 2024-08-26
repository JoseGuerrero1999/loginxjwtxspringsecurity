package com.proyecto.Serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.Entity.RolE;
import com.proyecto.Repoistory.RolRepository;
@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepository rolrepo;

	@Override
	public List<RolE> listaderoles() {
		return rolrepo.findAll();
	}

	@Override
	public RolE nombreRol(String nombreRol) {
		
		return rolrepo.findByNombreRol(nombreRol);
	}
}
