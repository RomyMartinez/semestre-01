import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int numero, repetidor, total = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = in.nextInt();
        System.out.print("Digite outro numero: ");
        repetidor = in.nextInt();
        for (int i = 1; i <= numero; i++) {
            total = total + repetidor;
        }
        System.out.println("Resultado da multiplicação: " + total);
    }
}
