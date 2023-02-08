package com.generation.devgames.repository;

import java.util.List;

import com.generation.devgames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomejogoContainingIgnoreCase(String nome);
}