package com.sicredi.cpfvalidator.service;

import org.springframework.stereotype.Service;

import static com.sicredi.cpfvalidator.util.CpfValidation.isCPF;

@Service
public class CpfValidationService {

    public String validateCPF(String cpf){
        var cpfValide = isCPF(cpf);
        return cpfValide ? "Valido" : "Invalido";
    }

}
