package com.Caio.SpringBootProject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Caio.SpringBootProject.model.entity.Usuario;

//primeiro argumento é a entidade e o segundo é o tipo da chave primaria
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	// pelo extends, a interface ja vai prover os metodos padroes de salvar,atualizar,deletar e consultar...
	// em tempo de exeucao ja implementa a interface SpringData
	
	// QUERY METHODS -- nao precisa dizer como que ele ira gerar o comando sql para consulta
	// Optinal segnifica se existe ou nao (return user ou null)
	//	Optional<Usuario>findByEmail(String email);	// return null ou usuario que tem o email
	// Optional<Usuario>findByEmailAndNome(String email,String nome);

	boolean existsByEmail(String email); // return 0 ou 1
}
