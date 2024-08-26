package com.proyecto.Serivce;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.Entity.UsuarioE;
import com.proyecto.Repoistory.UsuarioRepository;



@Service
public class JpaUsuarioDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usurepo;
	
	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 Optional<UsuarioE> optionalUser = usurepo.findByUsuarioUsu(username);
		
		 if (optionalUser.isEmpty()) {
	            throw new UsernameNotFoundException(String.format("Username no existe en el sistema", username));
	        }

		 UsuarioE user = optionalUser.orElseThrow();
		 
		 List<GrantedAuthority> authorities = user.getRoles().stream()
		 .map(role -> new SimpleGrantedAuthority(role.getNombreRol()))
         .collect(Collectors.toList());
		 
		return new User(username,
                user.getContraUsuario(),
                true,
                true,
                true,
                true,
                authorities);
	}

}
