package SistemaBanco.model;
import SistemaBanco.exceptions.saldoInsuficiente;

public class Balance {
    public static void main(String[] args) {
        depositarSaldo(100, 50);
        try {
            sacarSaldo(100, 200);
        } catch (saldoInsuficiente e){
           System.err.println("Erro detectado : " + e.getMessage());
        }
    }

    public static void sacarSaldo(double balance, double quantidade) throws saldoInsuficiente {
        double saldo = balance - quantidade;
        if (saldo < 0) {
            throw new saldoInsuficiente("Você não tem dinheiro o suficiente para realizar este saldo, o valor ficaria : " + saldo);
        }
        System.out.println("Você sacou " + quantidade + " de " + balance + " com sucesso!");
    }
}