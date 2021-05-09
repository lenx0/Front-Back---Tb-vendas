package com.thiagoberaldo.tbvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thiagoberaldo.tbvendas.dto.SaleSuccessDTO;
import com.thiagoberaldo.tbvendas.dto.SaleSumDTO;
import com.thiagoberaldo.tbvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.thiagoberaldo.tbvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.thiagoberaldo.tbvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
