import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int[] vetorA = new int[21];
        int[] vetorB = new int[21];
        int n = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("------Criando Itens na lista A (Somente números)------\n");
        for (int i = 1; i < vetorA.length; i++) {
            System.out.printf("Digite o item %d: ", i);
            vetorA[i] = in.nextInt();
        }
        System.out.println("\n------Lista A------");
        for (int i = vetorA.length - 1; i > 0; i--) {
            vetorB[n] = vetorA[i];
            System.out.println("-" + vetorA[n]);
            n++;
        }
        System.out.println("------Lista B------");
        for (int i = 1; i < vetorB.length; i++) {
            System.out.println("-" + vetorB[i]);
        }
    }
}
