package com.Caio.SpringBootProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Caio.SpringBootProject.exceptions.RegraNegocioException;
import com.Caio.SpringBootProject.model.entity.Usuario;
import com.Caio.SpringBootProject.model.repository.UsuarioRepository;
import com.Caio.SpringBootProject.service.UsuarioService;

// classe de implementacao que gerencie a instancia dessa classe
@Service
public class UsuarioServiceImpl implements UsuarioService{

	private final UsuarioRepository usuarioRepository;	// camada de servico acesa a model para excutar como entidadades

	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = usuarioRepository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuario cadastrado com esse e-mail");
		}
	}

}
