package com.Caio.SpringBootProject.service;

import com.Caio.SpringBootProject.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar (String email,String senha);	// fazer login
	
	Usuario salvarUsuario(Usuario usuario);	// cria o usuario

	void validarEmail(String email);	// verificar se ja nao ha cadastro do email

}
