package com.thiagoberaldo.tbvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoberaldo.tbvendas.entities.Seller;


public interface SellerRepository extends JpaRepository<Seller, Long> {

}
