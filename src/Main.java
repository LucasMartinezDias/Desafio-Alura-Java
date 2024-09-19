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
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao ==3) {
                System.out.println("Valor recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcção invalida");
            }
        }
    }
}