import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        int A, B, C, total;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        A = in.nextInt();
        System.out.print("Digite o primeiro numero: ");
        B = in.nextInt();
        System.out.print("Digite o primeiro numero: ");
        C = in.nextInt();
        total = Somado(A, B, C);
        Mostrar(total);

    }

    public static void Mostrar(int total) {
        System.out.println("Total: " + total);
    }

    public static int Somado(int A, int B, int C) {
        int Total;
        Total = A + B + C;
        return Total;
    }

}
