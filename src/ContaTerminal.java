import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String nome;
        String agencia;
        double saldo;

        System.out.println("Olá, vamos inicar seu cadastro! :D ");

        System.out.print("Digite o numero da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o numero da agência: ");
        agencia = scanner.nextLine();
        
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        
        System.out.print("Infrome o valor que deseja depositar: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

    }
}
