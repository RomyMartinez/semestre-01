import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int Num;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Num = in.nextInt();
        System.out.println("Argumento: " + valor(Num));
    }

    public static char valor(int Num) {
        char valor;
        if (Num > 0) {
            valor = 'P';
            return valor;
        }
        valor = 'N';
        return valor;
    }
}
