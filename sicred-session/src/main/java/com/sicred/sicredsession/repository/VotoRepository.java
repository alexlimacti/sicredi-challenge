package com.sicred.sicredsession.repository;

import com.sicred.sicredsession.model.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {

    Optional<Voto> findByCpfAndId(String cpf, Long id);

    Long countByVotoAndId(boolean voto, Long id);

}
