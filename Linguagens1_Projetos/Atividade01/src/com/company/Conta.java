package com.company;

public class Conta {
    private double saldo;
    private Contas conta;
    public void sacar(double valor){
        if(saldo >= valor)
            saldo -= valor; //saldo = saldo - valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public double consultaSaldo(){
        return this.saldo;
    }
}