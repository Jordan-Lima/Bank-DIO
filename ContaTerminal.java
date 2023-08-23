import java.util.Scanner;

public class ContaTerminal {
    public static void criarConta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número: ");
        int contaNumero = sc.nextInt();
        System.out.println("Digite sua agência: ");
        String contaAgencia = sc.next(); // 067-8;
        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();
        double saldoConta = 237.48;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %04d%n e seu saldo %.2f já está disponível para saque\n", nomeCliente, contaAgencia, contaNumero, saldoConta);
        
        sc.close();
        
    }

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Bank DIO...");
        System.out.println("Cadastre-se[1] Entre na Conta[2]");
        Scanner sc = new Scanner(System.in);
        int menuConta = sc.nextInt();
        if (menuConta == 1) {
            criarConta();
        }
        sc.close();
    }
}
