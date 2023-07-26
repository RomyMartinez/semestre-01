import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int i = 1, contador = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        while (i > 0) {
            System.out.print("Digite um numero: ");
            i = in.nextInt();
            contador ++;
        }
        System.out.println("Quantidade de numeros digitados: " + contador);
    }
    }