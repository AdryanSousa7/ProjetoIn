package com.esporte.taxas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esporte.taxas.model.taxaModel;
import com.esporte.taxas.repository.taxaRepository;

import jakarta.persistence.Id;

@RestController
@RequestMapping("taxa")

public class taxaController {

	@Autowired
	private taxaRepository repository;
	@Id
	@GetMapping
	public ResponseEntity<?> Listar(){
	     List<taxaModel> lista = (List<taxaModel>) repository;
	     return ResponseEntity.ok(lista);

	}
}