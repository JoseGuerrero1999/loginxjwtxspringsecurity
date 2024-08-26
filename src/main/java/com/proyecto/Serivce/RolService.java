package com.proyecto.Serivce;

import java.util.List;

import com.proyecto.Entity.RolE;

public interface RolService {
	
	List<RolE> listaderoles();

	RolE nombreRol(String nombreRol);
}
