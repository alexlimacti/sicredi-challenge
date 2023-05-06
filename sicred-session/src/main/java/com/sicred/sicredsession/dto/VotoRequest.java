package com.sicred.sicredsession.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotoRequest {

    private String numeroSessao;

    private String cpf;
    private boolean voto;
    private String errorMessage;

}
