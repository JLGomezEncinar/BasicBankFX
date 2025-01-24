package com.iessanalberto.dam1.basicbankfx.services;

import com.iessanalberto.dam1.basicbankfx.models.Cliente;
import com.iessanalberto.dam1.basicbankfx.repositories.ClientRepository;
import javafx.util.Pair;

public class LoginServices {
    private ClientRepository clientRepository = ClientRepository.getInstance();
    public Pair<Boolean, Cliente> isLogged (String user, String password) {
        Pair<Boolean, Cliente> resultLogged = new Pair<>(false, null);

        if (!user.isEmpty() && !password.isEmpty()) {
            resultLogged = clientRepository.isLogged(user, password);
        }
        return resultLogged;
    }
}
