package com.Caio.SpringBootProject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Caio.SpringBootProject.model.entity.Lancamentos;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamentos, Long>{

}
