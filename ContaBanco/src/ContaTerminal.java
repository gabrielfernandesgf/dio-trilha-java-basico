import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroConta=0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 25;

        System.out.println("Qual seu Nome Completo?");
        nomeCliente = ler.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = ler.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        numeroConta = ler.nextInt();


        System.out.printf("Qual o saldo da conta? ");
        saldo = ler.nextDouble();

        System.out.println("----------------------------");
        System.out.printf("Ola "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ " conta "+numeroConta+ " e seu saldo "+saldo+ " já esta disponível para saque");


    }
}
