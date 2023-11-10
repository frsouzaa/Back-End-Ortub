package com.fatec.ourtub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.ourtub.model.CurtidaVideo;

@Repository
public interface CurtidaVideoRepository extends JpaRepository<CurtidaVideo, Long> {

    public List<CurtidaVideo> findByVideo(Long video_id);

    public List<CurtidaVideo> findByVideoAndUsuario(Long video, Long usuario);

}
