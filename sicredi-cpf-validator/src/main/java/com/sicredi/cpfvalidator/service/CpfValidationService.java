package com.sicredi.cpfvalidator.service;

import com.sicredi.cpfvalidator.dto.CpfResponseDTO;
import org.springframework.stereotype.Service;

import static com.sicredi.cpfvalidator.util.CpfValidation.isCPF;

@Service
public class CpfValidationService {

    public CpfResponseDTO validateCPF(String cpf){
        var cpfValide = isCPF(cpf);
        if(!cpfValide) {
            return CpfResponseDTO
                    .builder()
                    .status("UNABLE_TO_BOTE")
                    .build();
        }
        return CpfResponseDTO
                .builder()
                .status("ABLE_TO_BOTE")
                .build();
    }

}
