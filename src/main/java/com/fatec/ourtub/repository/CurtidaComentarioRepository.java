package com.fatec.ourtub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.ourtub.model.CurtidaComentario;

@Repository
public interface CurtidaComentarioRepository extends JpaRepository<CurtidaComentario, Long> {

    public List<CurtidaComentario> findByComentario(Long comentario);
    
    public List<CurtidaComentario> findByComentarioAndUsuario(Long comentario, long usuario);

}
