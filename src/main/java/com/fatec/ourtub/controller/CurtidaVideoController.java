package com.fatec.ourtub.controller;

import com.fatec.ourtub.model.CurtidaVideo;
import com.fatec.ourtub.repository.CurtidaVideoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curtidavideo")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CurtidaVideoController {

	@Autowired
	private CurtidaVideoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CurtidaVideo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CurtidaVideo> GetById(@PathVariable long id){
		return repository.findById(id)
						 .map(resp -> ResponseEntity.ok(resp))
						 .orElse(ResponseEntity.notFound().build());
	}
}
