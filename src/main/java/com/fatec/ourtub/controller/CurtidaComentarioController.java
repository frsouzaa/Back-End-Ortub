package com.fatec.ourtub.controller;

import com.fatec.ourtub.model.CurtidaComentario;
import com.fatec.ourtub.repository.CurtidaComentarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curtidacomentario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CurtidaComentarioController {

	@Autowired
	private CurtidaComentarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CurtidaComentario>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
