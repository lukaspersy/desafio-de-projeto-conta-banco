import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o número da agência:");
        String agencia = sc.next();

        System.out.println("Digite o número da conta:");
        int conta = sc.nextInt();

        System.out.println("Digite o saldo:");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo de  R$ %.2f já está disponível para saque",
        nome, agencia, conta, saldo );
    }
}
