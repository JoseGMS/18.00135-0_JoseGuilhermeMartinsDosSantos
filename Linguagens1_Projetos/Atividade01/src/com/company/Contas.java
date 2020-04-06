package com.company;

public class Contas {
    private static int ID;
    private double saldo;
    private Usuarios usuario;

    public Contas(Usuarios usuario){
        this.usuario = usuario;
        Contas.ID = Contas.ID + 1;
    }
    public int sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public Usuarios getUsuario(){
        return usuario;
    }
    public double getID(){
        return Contas.ID;
    }
}

