package com.enascimento.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enascimento.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
