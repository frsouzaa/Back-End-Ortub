package com.fatec.ourtub.controller;

import com.fatec.ourtub.model.Video;
import com.fatec.ourtub.repository.VideoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VideoController {

	@Autowired
	private VideoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Video>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Video> GetById(@PathVariable long id){
		return repository.findById(id)
						 .map(resp -> ResponseEntity.ok(resp))
						 .orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Video> post(@RequestBody Video video){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(video));
	}

	@PutMapping
	public ResponseEntity<Video> post(@RequestBody Video video){
	public ResponseEntity<Video> put(@RequestBody Video video){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(video));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		repository.deleteAllById(id);
	}
}
