package com.esporte.taxas.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esporte.taxas.model.taxaModel;

@Repository
	public interface taxaRepository extends JpaRepository<taxaModel,UUID>{

	}