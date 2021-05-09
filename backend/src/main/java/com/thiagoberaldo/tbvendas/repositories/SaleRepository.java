package com.thiagoberaldo.tbvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoberaldo.tbvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {

}
