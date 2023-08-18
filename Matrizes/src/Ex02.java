import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final int linha = 7;
        final int coluna = 2;
        int[] vetorA = new int[linha];
        int[] vetorB = new int[linha];
        int[][] matrizC = new int[linha][coluna];
        Scanner in = new Scanner(System.in);
        System.out.println("------Vetor A------");
        for (int i = 0; i < linha; i++) {
            System.out.printf("Digite o item %d: ", i + 1);
            vetorA[i] = in.nextInt();
        }
        System.out.println("\n------Vetor B------");
        for (int i = 0; i < linha; i++) {
            System.out.printf("Digite o item %d: ", i + 1);
            vetorB[i] = in.nextInt();
        }
        System.out.println("\n------Vetor C------");
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                if(c == 0){
                   matrizC[l][c] = vetorA[l];
                } else {
                   matrizC[l][c] = vetorB[l];
                }
                System.out.printf("%4d ", matrizC[l][c]);
            }
            System.out.println("");
        }
    }
}
