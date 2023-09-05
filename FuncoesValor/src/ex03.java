import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int A, B;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        A = in.nextInt();
        System.out.print("Digite o segundo numero: ");
        B = in.nextInt();
        System.out.println("Total: " + multiplicar(A, B));
    }

    public static int multiplicar(int A, int B) {
        int total = 0;
        for (int i = 1; i <= B; i++) {
            total = total + A;

        }
        return total;
    }
}
