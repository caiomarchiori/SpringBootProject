package com.Caio.SpringBootProject.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.Caio.SpringBootProject.model.enums.StatusLancamento;
import com.Caio.SpringBootProject.model.enums.TipoLacamento;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "lancamentos" , schema = "project") //table from postgres

//from lombok
@Data
@Builder


public class Lancamentos {

	@Id //primary key
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "mes")
	private Integer mes;
	
	@Column(name = "ano")
	private Integer ano;
	
	@ManyToOne	// muitos lancamentos para apenas um usuario -- @ManyToMany @OneToOne @OneToMany
	@JoinColumn(name = "id_user")	// foreign key
	private Usuario usuario;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)	// Spring date JPA
	private LocalDate dataCadastro;
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLacamento tipo;
	
	@Column(name = "status")
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;
}
