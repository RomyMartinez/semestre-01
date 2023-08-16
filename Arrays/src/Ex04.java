import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int[] vetorA = new int[51];
        int maior = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < vetorA.length; i++) {
            System.out.printf("Digite o item %d: ", i);
            vetorA[i] = in.nextInt();
            if (vetorA[i] > maior) {
                maior = vetorA[i];
            }
        }
        System.out.println("------Maiores números------");
        for (int i = 1; i < vetorA.length; i++) {
            if (vetorA[i] == maior){
                System.out.printf("-Item %d\n",i);
            }
        }
    }
}
