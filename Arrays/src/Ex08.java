import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int N = 0, quantidade = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista: ");
        N = in.nextInt() + 1;
        int[] vetorA = new int[N];
        int[] vetorB = new int[N];
        int[] vetorC = new int[N];
        System.out.println("------Lista A-----");
        for (int i = 1; i < vetorA.length; i++) {
            System.out.printf("Digite o item %d: ", i);
            vetorA[i] = in.nextInt();
        }
        System.out.println("\n------Lista B-----");
        for (int i = 1; i < vetorB.length; i++) {
            System.out.printf("Digite o item %d: ", i);
            vetorB[i] = in.nextInt();
        }
        System.out.println("\n------Soma da lista A e B-----");
        for (int i = 1; i < vetorB.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("-" + vetorC[i]);
            if(vetorA[i] == vetorB[i]){
                quantidade++;
            }
        }
        System.out.println("\nQuantidade de vezes que tem o mesmo números nas lista A e B: " + quantidade);
    }
}