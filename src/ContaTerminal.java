import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o numero da sua agência!");
        String numeroAgencia = scan.nextLine();

        System.out.println("Por favor, digite o numero da sua conta!");
        int numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o valor dentro do seu saldo!");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("O numero de sua agência é " + numeroAgencia + ", o numero de sua conta é " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
