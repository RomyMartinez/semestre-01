import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int N, contador = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        N = in.nextInt();
        for (int i = 2; i < 10; i++) {
            if ((N % i) == 0) {
                contador++;
            }
        }
        if ((N == 1) || (N == 2) || (N == 3) || (N == 7)) {
            System.out.println("Numero primo");
        } else {
            if (contador == 0) {
                System.out.println("Numero primo");
            } else {
                System.out.println("Numero não primo");
            }
        }
    }
}