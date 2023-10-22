package com.Caio.SpringBootProject.model.repository;



import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Caio.SpringBootProject.model.entity.Usuario;

@SpringBootTest //sube o springbot
@RunWith(SpringRunner.class)

public class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository repository;
	
	// todos os metodos de teste apresentam retorno void
	@Test
	public void verificarEmail() {
		
		//cenario
		Usuario usuario = Usuario.builder().nome("usuario").email("email").build();
		repository.save(usuario);	//cadastra na base de dados
		
		//execucao
		boolean result = repository.existsByEmail("email");

		//verificacao
		Assertions.assertThat(result).isTrue();
	}
}