import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = in.nextInt();
        System.out.println("Fatorial: " + fatorial(numero));
    }

    public static int fatorial(int numero) {
        int total = 1;
        if (numero >= 0) {
            for (int i = 1; i <= numero; i++) {
                total = total * i;
            }
            return total;
        }
        numero = -1;
        return numero;
    }
}
