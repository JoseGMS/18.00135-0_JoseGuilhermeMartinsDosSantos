package Exemplo01;

public class Conta {
    //atributos da classe
    public int numero;
    public Cliente cliente;
    public double saldo;

    //metodos da classe
    boolean sacar(double valor){
        if (valor > this.saldo)
            return false;
        else {
            this.saldo -= valor;
            return true;
        }
    }
    void depositar(double valor){
        this.saldo += valor;
    }
    void visualizarSaldo(){
        System.out.println("Saldo: " + this.saldo);

    }
    boolean transferirDinheiro(Conta destino, double valor){
        if(sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        else
            return false;
    }

}

