import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) throws Exception {
        float A, B, C = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero A: ");
        A = in.nextFloat();
        System.out.print("Digite o numero B: ");
        B = in.nextFloat();
        System.out.print("Digite o numero C: ");
        C = in.nextFloat();
        if (A < B && A < C) { // Para quando A for o menor
            System.out.println(A);
            if (B < C) {
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }
        } else {
            if (B < A && B < C) { // Para quando B for o menor
                System.out.println(B);
                if (A < C) {
                    System.out.println(A);
                    System.out.println(C);
                } else {
                    System.out.println(C);
                    System.out.println(A);
                }
            } else {
                if (C < A && C < B) { // Para quando C for menor
                    System.out.println(C);
                    if (A < B) {
                        System.out.println(A);
                        System.out.println(B);
                    } else {
                        System.out.println(B);
                        System.out.println(A);
                    }
                }
            }
        }
    }
}