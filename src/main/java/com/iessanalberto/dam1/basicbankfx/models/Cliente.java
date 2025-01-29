package com.iessanalberto.dam1.basicbankfx.models;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String clave;
    private float saldo;

    //Constructor

    public Cliente(String dni, String nombre, String apellidos, String clave, float saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.clave = clave;
        this.saldo = saldo;
    }

    // Actualiza el saldo si hay suficiente dinero, si no devuelve falso
    public boolean actualizarSaldo(float dinero) {
        boolean isDone = false;
        if (saldo >= -dinero) {
            saldo = saldo + dinero;
            isDone = true;
        }
        return isDone;
    }

    public float getSaldo() {
        return saldo;
    }

    // Consultar saldo
    public float consultarSaldo() {
        return saldo;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
