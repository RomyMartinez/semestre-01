import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        float[] vetorA = new float[201];
        float media, soma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("------Lista A------");
        for (int i = 1; i < vetorA.length; i++) {
            System.out.printf("Digite o item %d: ", i);
            vetorA[i] = in.nextFloat();
            soma = soma + vetorA[i];
        }
        media = soma / (vetorA.length - 1);
        System.out.printf("Media é %.2f \n", media);
        System.out.println("\n------Itens acima da media------");
        for (int i = 1; i < vetorA.length; i++) {
            if (vetorA[i] > media) {
                System.out.printf("Item %d acima da media, valor: %.2f  \n", i, vetorA[i]);
            }
        }
    }
}
