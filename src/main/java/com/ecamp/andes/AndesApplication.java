package com.ecamp.andes;

import com.ecamp.andes.model.Alumno;
import com.ecamp.andes.model.Materia;
import com.ecamp.andes.model.Role;
import com.ecamp.andes.model.Usuario;
import com.ecamp.andes.services.AlumnoService;
import com.ecamp.andes.services.MateriaService;
import com.ecamp.andes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class AndesApplication implements CommandLineRunner{
	@Autowired
	private MateriaService materiaService;
	@Autowired
	private AlumnoService alumnoService;
	@Autowired
	private UserService userService;
	@Autowired
	private PasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(AndesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setName("Diego");
		usuario.setUsername("diego7");
		usuario.setEmail("diego@gmail.com");
		usuario.setClave(encoder.encode("1234"));
		usuario.setRole(Role.ADMIN);
		userService.saveUser(usuario);

		Materia materia = new Materia();
		materia.setNombre("matematicas");

		Alumno alumno = new Alumno();
		alumno.setNombre("Mathias");
		alumno.setRut("20312");
		alumno.setDireccion("santiago");

		Set<Materia> materias = new HashSet<>();
		materias.add(materia);


		alumno.setMateriaList(materias);

		materiaService.saveMateria(materia);
		alumnoService.saveAlumno(alumno);




	}






}
