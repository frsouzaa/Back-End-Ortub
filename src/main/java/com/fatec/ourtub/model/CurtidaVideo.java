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
	private long id;
	private long video;
	private long usuario;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getVideo() {
		return this.video;
	}

	public void setVideo(long video) {
		this.video = video;
	}

	public long getUsuario() {
		return this.usuario;
	}

	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}
}