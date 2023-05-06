package com.sicred.sicredsession.service;

import com.sicred.sicredsession.dto.VotoRequest;
import com.sicred.sicredsession.dto.VotoResponse;
import com.sicred.sicredsession.mapper.VotoMapper;
import com.sicred.sicredsession.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private VotoMapper votoMapper;

    public VotoResponse create(VotoRequest votoRequest) {
        var voto = votoMapper.toEntity(votoRequest);
        var votoResponse = votoRepository.save(voto);
        return VotoResponse.builder()
                .cpf(votoRequest.getCpf())
                .votoProcessado(true)
                .build();
    }
}
