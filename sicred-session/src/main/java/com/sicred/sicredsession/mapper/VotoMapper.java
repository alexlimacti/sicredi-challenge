package com.sicred.sicredsession.mapper;

import com.sicred.sicredsession.dto.VotoRequest;
import com.sicred.sicredsession.model.Voto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VotoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Voto toEntity(VotoRequest votoRequest) {
        return modelMapper.map(votoRequest, Voto.class);
    }

}
