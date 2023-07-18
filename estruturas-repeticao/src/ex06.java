import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int superior, soma = 0, inferior = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero superior: ");
        superior = in.nextInt();
        System.out.print("Digite o numero inferior: ");
        inferior = in.nextInt();
        while (inferior <= superior) {
            if (inferior % 2 == 0) {
                System.out.println("Numero par: " + inferior);
                soma = soma + inferior;
            }
            inferior++;
        }
        System.out.println("Soma total: " + soma);
    }
}
