package com.example.apr.service;

import com.example.apr.AccountValidators.AccountValidator;
import com.example.apr.AccountValidators.EmailAccountValidator;
import com.example.apr.Dto.AccountValidationDTO;
import com.example.apr.exceptions.FormatEmailException;
import com.example.apr.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    private AccountValidator accountValidator;

    public boolean validateClient(AccountValidationDTO accountValidationDTO) throws FormatEmailException {
        accountValidator = new EmailAccountValidator();
        return accountValidator.isAuthorized(accountValidationDTO);
    }
}
