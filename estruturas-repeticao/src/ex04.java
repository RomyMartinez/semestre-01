import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int N, soma = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero onde a soma vai parar: ");
        N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            soma = soma + i;
        }
        System.out.println("Soma total: " + soma);
    }
}
