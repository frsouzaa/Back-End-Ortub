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
	private long id;
	private long comentario;
	private long usuario;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getComentario() {
		return this.comentario;
	}
	public void setComentario(long comentario) {
		this.comentario = comentario;
	}

	public long getUsuario() {
		return this.usuario;
	}

	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}
}