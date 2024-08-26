package com.proyecto.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name ="tb_roles")
public class RolE {

	    @Id
	    @Column(name = "id_Rol")
	    private Long idRol;

	    @Column(name = "nombre_Rol")
	    private String nombreRol;
}
