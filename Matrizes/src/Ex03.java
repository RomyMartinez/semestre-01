import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final int coluna = 4, linha = 4;
        boolean Acabou = false;
        int userL, userC, tentativas = 5;
        char[][] Resposta = new char[linha][coluna];
        char[][] Jogada = new char[linha][coluna];
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int linhaY = rand.nextInt(4);
        int colunaY = rand.nextInt(4);
        Resposta[linhaY][colunaY] = 'Y';
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                if (Resposta[l][c] != 'Y') {
                    Resposta[l][c] = 'X';
                }
            }
        }
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                Jogada[l][c] = 'O';
            }
        }
        do {
            System.out.println("------ TENTATIVAS: " + tentativas + " ------");
            System.out.print("Digite a linha: ");
            userL = in.nextInt() - 1;
            System.out.print("Digite a coluna: ");
            userC = in.nextInt() - 1;
            if (Resposta[userL][userC] == 'Y') {
                Acabou = true;
                Jogada[userL][userC] = 'Y';
            } else {
                Jogada[userL][userC] = 'X';
                System.out.println("\n------ Resposta Errada ------");
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) {
                        System.out.printf("%4c ", Jogada[l][c]);
                    }
                    System.out.println("");
                }
                System.out.println("");
                tentativas--;
            }
            if (tentativas == 0) {
                Acabou = true;
            }
        } while (Acabou == false);
        if (tentativas == 0) {
            System.out.println("\n\n------ VOCE PERDEU - Resposta ------\n");
            for (int l = 0; l < linha; l++) {
                for (int c = 0; c < coluna; c++) {
                    System.out.printf("%4c ", Resposta[l][c]);
                }
                System.out.println("");
            }
        } else {
            if (tentativas > 0) {
                System.out.println("\n\n------ VOCE GANHOU - Resposta Final ------\n");
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) {
                        System.out.printf("%4c ", Jogada[l][c]);
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
}