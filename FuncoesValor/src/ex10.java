import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = in.nextInt();
        imprimir(numero);
    }
    public static void imprimir(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
