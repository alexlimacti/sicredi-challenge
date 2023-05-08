package com.sicred.challenge.repository;

import com.sicred.challenge.enumerator.Status;
import com.sicred.challenge.model.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long> {

    Optional<Sessao> findByPauta_Id(Long pautaId);

    List<Sessao> findByStatus(Status status);

}