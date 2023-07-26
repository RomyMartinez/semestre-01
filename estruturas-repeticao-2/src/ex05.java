import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        char escolha;
        float Saldo = 0, Depositar, Retirar;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("(a) Deposito");
        System.out.println("(b) Retirada ");
        System.out.println("(c) Saldo");
        System.out.println("(d) Sair do programa\n");
        do {
            System.out.print("Digite a uma das opções: ");
            escolha = in.nextLine().charAt(0);
            switch (escolha) {
                case 'a':
                    System.out.print("Digite a quantidade a depositar: ");
                    Depositar = in.nextFloat();
                    Saldo = Saldo + Depositar;
                    in.nextLine();
                    break;
                case 'b':
                    System.out.print("Digite a quantidade a retirar: ");
                    Retirar = in.nextFloat();
                    if (Retirar > Saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        Saldo = Saldo - Retirar;
                    }
                    in.nextLine();
                    break;
                case 'c':
                    System.out.println("Seu saldo é de: " + Saldo);
                    break;
                case 'd':
                    System.out.println("Você está saindo do programa");
                    escolha = 'd';
                    break;

                default:
                    System.out.println("Verifique se a opção escolhida está digitada corretamente");
                    break;
            }
        } while (escolha != 'd');

    }
}
