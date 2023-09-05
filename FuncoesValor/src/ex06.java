import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = in.nextInt();
        System.out.println("Primo: " + primo(numero));
    }
    public static boolean primo(int numero){
        boolean ePrimo = false;
        int resto = 0;
        for (int i = 1; i <= numero; i++) {
            if ((numero%i) == 0){
                resto++;
            }
        }
        if (resto == 2) {
            ePrimo = true;
            return ePrimo;
        }
        return false;
    }
}
