import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        final int altura = 5, largura = 4, comprimento = 2;
        int[][][] matriz = new int[altura][largura][comprimento];
        Scanner in = new Scanner(System.in);
        for (int a = 0; a < altura; a++) {
            for (int l = 0; l < largura; l++) {
                for (int c = 0; c < comprimento; c++) {
                    System.out.printf("Digite um numero(Altura %d, largura %d, comprimento %d): ", a, l, c);
                    matriz[a][l][c] = in.nextInt();
                }
            }
            System.out.println("");
        }
        System.out.println("------Profundidade 0------");
        for (int a = 0; a < altura; a++) {
            for (int l = 0; l < largura; l++) {
                System.out.printf("%4d ", matriz[a][l][0]);
            }
            System.out.println("");
        }
        System.out.println("------Profundidade 1------");
        for (int l = 0; l < largura; l++) {
            for (int c = 0; c < comprimento; c++) {
                System.out.printf("%4d ", matriz[0][l][c]);
            }
            System.out.println("");
        }
    }
}
