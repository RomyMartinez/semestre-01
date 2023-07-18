import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        float numeros, soma = 0;
        int contador = 1;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        while (contador <= 100) {
            contador++;
            System.out.print("Digite um número: ");
            numeros = in.nextFloat();
            soma = numeros + soma;
        }
        System.out.println("Soma total: " + soma);
    }
}
