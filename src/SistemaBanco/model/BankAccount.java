package SistemaBanco.model;

import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;


public class BankAccount {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o seu nome!");
            String nomeCliente = scan.nextLine();

            System.out.println("Por favor, digite o numero da sua agência!");
            String numeroAgencia = scan.nextLine();

            System.out.println("Por favor, digite o numero da sua conta!");
            int numeroConta = scan.nextInt();

            System.out.println("Por favor, digite o valor do seu saldo!");
            public double saldo = scan.nextDouble();

            System.out.println("Olá " + nomeCliente
                    + ", obrigado por criar uma conta em nosso banco!");
            System.out.println("Agência: " + numeroAgencia
                    + " | Conta: " + numeroConta
                    + " | Saldo disponível: " + saldo);
        } catch (InputMismatchException e){
            System.out.println("Erro : Formato de entrada invalido");
        }

    }

}
