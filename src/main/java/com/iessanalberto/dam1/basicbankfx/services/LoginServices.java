package com.iessanalberto.dam1.basicbankfx.services;

import com.iessanalberto.dam1.basicbankfx.repositories.ClientRepository;

public class LoginServices {
    private ClientRepository clientRepository = ClientRepository.getInstance();
    public  boolean isLogged (String user, String password) {

        boolean isClientLogged = false;
        if (!user.isEmpty() && !password.isEmpty()) {
            isClientLogged = clientRepository.isLogged(user, password);
        }
        return isClientLogged;
    }
}
