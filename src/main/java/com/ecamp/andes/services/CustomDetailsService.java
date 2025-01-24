package com.ecamp.andes.services;

import com.ecamp.andes.model.Usuario;
import com.ecamp.andes.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class CustomDetailsService implements UserDetailsService {

    private final IUserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Usuario usuario = userRepository.findByUsername(username).
               orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado:_" + username));
        log.info("Buscando al usuario: {}", username);

       return User.builder()
               .username(usuario.getUsername())
               .password(usuario.getClave())
               .roles(usuario.getRole().toString())
               .build();

    }
}
