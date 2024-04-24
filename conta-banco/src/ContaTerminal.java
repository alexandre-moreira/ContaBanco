import java.util.Scanner;

public class ContaTerminal {
 
 public static void main(String[] args) {
    Conta conta = new Conta();
    Scanner input =  new Scanner(System.in);
    boolean sair = false;

    while (!sair) {
        System.out.println("============== Digital Bank ==============");
        System.out.println("1. Cadastrar conta");
        System.out.println("2. Visualizar conta");
        System.out.println("3. Sair do sistema");
        System.out.println("===========================================");

        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                cadastrarConta(conta, input);
                break;
            case 2:
                visualizarConta(conta);
                break;
            case 3:
                sair = true;
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
 }

 public static void cadastrarConta(Conta conta, Scanner input) {
    System.out.print("Digite o número da conta: ");
    conta.numero = input.nextInt();

    System.out.print("Digite a agência: ");
    conta.agencia = input.next();

    System.out.print("Digite seu nome: ");
    conta.nomeCliente = input.next();

    System.out.print("Realizar depósito: ");
    conta.saldo = input.nextDouble();
    
    System.out.println("Conta cadastrada com sucesso!");
 }

 public static void visualizarConta(Conta conta) {
    System.out.println("============== Digital Bank ==============");
    System.out.println("Número da conta: " + conta.numero);
    System.out.println("Agência: " + conta.agencia);
    System.out.println("Cliente: " + conta.nomeCliente);
    System.out.println("Saldo: " + conta.saldo);
    System.out.println("===========================================");
 }

}