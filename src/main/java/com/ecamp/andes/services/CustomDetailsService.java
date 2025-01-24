package com.ecamp.andes.services;

import com.ecamp.andes.model.Usuario;
import com.ecamp.andes.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomDetailsService implements UserDetailsService {

    private final IUserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Usuario usuario = userRepository.findByUsername(username).
               orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado:_" + username));
        System.out.println(usuario.getRole().toString());

       return User.builder()
               .username(usuario.getUsername())
               .password(usuario.getClave())
               .roles(usuario.getRole().toString())
               .build();

    }
}
