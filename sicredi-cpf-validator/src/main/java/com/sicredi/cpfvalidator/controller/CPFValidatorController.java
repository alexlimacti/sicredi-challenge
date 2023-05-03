package com.sicredi.cpfvalidator.controller;

import com.sicredi.cpfvalidator.service.CpfValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpf-validator")
public class CPFValidatorController {

    @Autowired
    private CpfValidationService cpfValidationService;

    @GetMapping
    public ResponseEntity<String> validateCPF(@RequestBody String cpf) {
        return ResponseEntity.ok(cpfValidationService.validateCPF(cpf));
    }

}
