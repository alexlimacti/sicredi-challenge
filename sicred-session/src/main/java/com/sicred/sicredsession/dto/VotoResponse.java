package com.sicred.sicredsession.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VotoResponse {

    private String cpf;
    private boolean votoProcessado;

}
