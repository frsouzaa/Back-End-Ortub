package com.fatec.ourtub.controller;

import com.fatec.ourtub.model.CurtidaComentario;
import com.fatec.ourtub.repository.CurtidaComentarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curtidacomentario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CurtidaComentarioController {

	@Autowired
	private CurtidaComentarioRepository repository;

	@GetMapping("/{comentario}")
	public ResponseEntity<List<CurtidaComentario>> getByComentario(@PathVariable Long comentario) {
		List<CurtidaComentario> curtidas = repository.findByComentario(comentario);
		if (curtidas.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(curtidas);
	}

	@PostMapping
	public ResponseEntity<CurtidaComentario> post(@RequestBody CurtidaComentario curtidaComentario) {
		List<CurtidaComentario> curtidas = repository.findByComentarioAndUsuario(curtidaComentario.getComentario(), curtidaComentario.getUsuario());
		if (!curtidas.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(curtidaComentario));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
