package com.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.Entity.RolE;
import com.proyecto.Serivce.RolService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/tipos")
public class RolController {

	@Autowired
    private RolService rolrepo;

    @GetMapping("/roles")
    @ResponseBody
    public ResponseEntity<List<RolE>> lsitaroles() {
	List<RolE> lista = rolrepo.listaderoles();
	return ResponseEntity.ok(lista);
	}

}
