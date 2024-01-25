
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String nome = "Maria de Deus Vieira";
       String tipoConta = "Conta Corrente";
       double saldo = 5000;
       int opcao = 0;

       Scanner read = new Scanner(System.in);

        System.out.println("*************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
        System.out.println("*************************************************");


        while (opcao != 4) {

            System.out.println("Operações:\n");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor:");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - sair\n");
            System.out.println("Digite a opção desejada:");

            opcao = read.nextInt();
            double valor = 0;

            switch (opcao) {
                case 1:
                    System.out.println("O saldo: " + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que irá receber");
                    valor = read.nextDouble();
                    saldo += valor;
                    break;

                case 3:
                    System.out.println("Digite o valor que irá transferir:");
                    valor = read.nextDouble();

                    if(valor > saldo) {
                        System.out.println("Você não tem esse valor em conta");
                    } else {
                        saldo -= valor;
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opcao inválida");

            }
        }
    }
}