package com.fatec.ourtub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curtida_video")
public class CurtidaVideo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_video;
	private long id_usuario;
	
	public long getId_video() {
		return this.id_video;
	}

	public void setId_video(long id_video) {
		this.id_video = id_video;
	}

	public long getId_usuario() {
		return this.id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
}