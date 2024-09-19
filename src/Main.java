import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String usuario = "Lucas Martinez Dias";
        String tipoConta = "Corrente";
        double saldo = 1412.00;
        int opcao = 0;
        String menu = """
                **Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        System.out.println("***************************************");
        System.out.println("\nNome: " + usuario);
        System.out.println("\nTipo de conta: " + tipoConta);
        System.out.println("\nSaldo inicial: " + saldo);
        System.out.println("Teste de commit");
        System.out.println("***************************************");

        Scanner sc = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            }
        }
    }
}