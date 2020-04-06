package com.company;
import java.util.Queue;
import java.util.Random;

public class transacoes {
    private String QRCode;

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public String receber(Contas conta, int valor){
        QRCode = conta.getID() + ";" + conta.getUsuario().getNome() + ";" + valor + ";" + getRandomNumberInRange(1000, 9999);
        return this.QRCode;
    }
    public void transferir(Contas conta1, Contas conta2, String QRCode){
        String[] dados = QRCode.split(";");
        if(Double.parseDouble(dados[0] ) == conta2.getID())
        {
            conta1.sacar(Double.parseDouble(dados[2]));
            conta2.depositar(Double.parseDouble(dados[2]));

        }
    }
}
