package com.company;

public class Main {

    public static void main(String[] args) {
        Usuarios usuario1 = new Usuarios("Murilo", "12343", "oi");
        Contas conta1 = new Contas(usuario1);
        conta1.depositar(1000);
        System.out.println(conta1.getSaldo());
        Usuarios usuario2 = new Usuarios("Jose", "123432", "oie");
        Contas conta2 = new Contas(usuario2);
        conta2.depositar(250);
        System.out.println(conta2.getSaldo());
        Usuarios usuario3 = new Usuarios("Carla", "senha", "oia");
        Contas conta3 = new Contas(usuario3);
        conta3.depositar(3000);
        System.out.println(conta3.getSaldo());
        transacoes t1 = new transacoes();
        t1.receber(conta1, 250);
        t1.transferir(conta2, conta1,t1.receber(conta1, 250));
        t1.transferir(conta3, conta1,t1.receber(conta1, 250));
        t1.transferir(conta2, conta1,t1.receber(conta1, 250));
        t1.receber(conta2, 1000);
        t1.transferir(conta3, conta2,t1.receber(conta2, 1000));
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());
    }
}