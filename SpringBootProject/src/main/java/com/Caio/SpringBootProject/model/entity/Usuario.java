package com.Caio.SpringBootProject.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "user" , schema = "project") //table from postgree

//from lombok
@Data
@Builder

public class Usuario {
	
	@Id	// primary key
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "dataCadastro")
	private LocalDate dataCadastro;
}
