import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        int acao = 0, deposito = 0, retirada = 0, saldo = 0, extrato = 0, total = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Deposito");
        System.out.println("2 - Retirada");
        System.out.println("3 - Saldo");
        System.out.println("4 - Extrato");
        System.out.println("5 - Sair do Programa");
        do {
            System.out.print("Qual açao realizada: ");
            acao = in.nextInt();
            switch (acao) {
                case 1:
                    deposito++;
                    break;
                case 2:
                    retirada++;
                    break;
                case 3:
                    saldo++;
                    break;
                case 4:
                    extrato++;
                    break;
                case 5:
                    acao = 5;
                    break;
                default:
                    System.out.println("Açao nao reconhecida");
                    break;
            }
        } while (acao != 5);
        System.out.println("Açoes realizadas: ");
        System.out.println("Deposito: " + deposito);
        System.out.println("Retirada: " + retirada);
        System.out.println("Saldo: " + saldo);
        System.out.println("Extrato: " + extrato);
        total = deposito + retirada + saldo + extrato;
        System.out.println("Total: " + total);
    }
}
