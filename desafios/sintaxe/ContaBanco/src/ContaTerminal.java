
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double saldo = 237.48;

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        int agencia = sc.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
