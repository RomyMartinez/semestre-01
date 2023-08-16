import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int[] Idades = new int[31];
        String[] Nomes = new String[31];
        int Maior = 0;
        float media, soma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("------Inserindo os nomes e idades------");
        for (int i = 1; i < Idades.length; i++) {
            System.out.printf("Digite o nome %d: ", i);
            Nomes[i] = in.nextLine();
            System.out.print("Digite o nome a idade: ");
            Idades[i] = in.nextInt();
            soma = soma + Idades[i];
            in.nextLine();
            if (Idades[i] > Maior) {
                Maior = Idades[i];
            }
        }
        media = soma / (Idades.length - 1);
        System.out.printf("\nMedia é %.2f \n", media);
        System.out.println("\n------Pessoas acima da media------");
        for (int i = 1; i < Idades.length; i++) {
            if (Idades[i] > media) {
                System.out.println(Nomes[i] + ", idade: " + Idades[i]);
            }
        }
    }
}
