package com.sicred.challenge.repository;

import com.sicred.challenge.model.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {

    Optional<Pauta> findByNumero(String numero);
}
