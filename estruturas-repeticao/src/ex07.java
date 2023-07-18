import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int N = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero superior: ");
        N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0) {
                System.out.println("Numero divisíveis por 7: " + i);
            }
        }
    }

}
