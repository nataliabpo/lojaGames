package com.loja.gamestart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.gamestart.model.Categoria;

import org.springframework.data.repository.query.Param;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {

	   public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

	}