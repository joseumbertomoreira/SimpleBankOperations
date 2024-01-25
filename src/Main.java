
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

    }
}