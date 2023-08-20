import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        final int delegacoes = 5;
        final int atletas = 10;
        float[][] matriz = new float[delegacoes][atletas];
        float maior = 0;
        Scanner in = new Scanner(System.in);
        for (int l = 0; l < delegacoes; l++) {
            System.out.printf("------Delegação %d------\n", l + 1);
            for (int c = 0; c < atletas; c++) {
                System.out.printf("Digite a altura do atleta %d: ", c + 1);
                matriz[l][c] = in.nextFloat();
            }
            System.out.println("");
        }
        for (int l = 0; l < delegacoes; l++) {
            System.out.printf("------Delegação %d------\n", l + 1);
            for (int c = 0; c < atletas; c++) {
                if (maior < matriz[l][c]) {
                    maior = matriz[l][c];
                }
            }
            System.out.printf("Maior altura: %.2fm \n", maior);
            System.out.println("");
        }
    }
}
