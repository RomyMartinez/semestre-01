import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        final int coluna = 3;
        final int linha = 5;
        int[][] matrizA = new int[linha][coluna];
        int[][] matrizB = new int[linha][coluna];
        int[][] matrizC = new int[linha][coluna];
        Scanner in = new Scanner(System.in);
        System.out.println("------Matriz A------");
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.printf("Digite o numero da linha %d e coluna %d: ", l + 1, c + 1);
                matrizA[l][c] = in.nextInt();
            }
        }
        System.out.println("");
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.printf("%4d ", matrizA[l][c]);
            }
            System.out.println("");
        }
        System.out.println("\n------Matriz B------");
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.printf("Digite o numero da linha %d e coluna %d: ", l + 1, c + 1);
                matrizB[l][c] = in.nextInt();
            }
        }
        System.out.println("");
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                System.out.printf("%4d ", matrizB[l][c]);
            }
            System.out.println("");
        }
        System.out.println("\n------Matriz C------\n");
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
                System.out.printf("%4d ", matrizC[l][c]);
            }
            System.out.println("");
        }

    }
}
