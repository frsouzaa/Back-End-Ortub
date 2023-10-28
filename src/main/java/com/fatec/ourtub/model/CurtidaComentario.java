package com.fatec.ourtub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curtida_comentario")
public class CurtidaComentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_comentario;
	private long id_usuario;
	
	public long getId_comentario() {
		return this.id_comentario;
	}
	public void setId_comentario(long id_comentario) {
		this.id_comentario = id_comentario;
	}

	public long getId_usuario() {
		return this.id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
}