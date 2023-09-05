import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
     int numero;
     Scanner in = new Scanner(System.in);
     System.out.print("Digite um numero: ");
     numero = in.nextInt();
     System.out.println("Numero perfeito: " + Perfect(numero));

    }
    public static boolean Perfect (int numero){
        int total = 0;
        boolean perfeito = false;
        for (int i = 1; i < numero; i++) {
            if((numero%i) == 0){
            total = total + i;
            }
        }
        if(total == numero){
            perfeito = true;
            return perfeito;
        }
        return perfeito;
    }
}
