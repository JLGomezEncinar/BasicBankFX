package com.iessanalberto.dam1.basicbankfx.services;

public class LoginServices {
    public static boolean isLogged (String user, String password) {
        return user.equals("admin") && password.equals("admin");
    }
}
