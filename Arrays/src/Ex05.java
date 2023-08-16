import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        String[] nomes = new String[201];
        char[] sexo = new char[201];
        Scanner in = new Scanner(System.in);
        System.out.println("\n------Lista de nomes------");
        for (int i = 1; i < nomes.length; i++) {
            System.out.printf("Digite o nome %d: ", i);
            nomes[i] = in.nextLine();
            System.out.print("Digite o sexo: ");
            sexo[i] = in.nextLine().charAt(0);
        }
        System.out.println("\n------Lista de mulheres------");
        for (int i = 1; i < nomes.length; i++) {
            if (sexo[i] == 'f' || sexo[i] == 'F') {
                System.out.println("-" + nomes[i]);
            }
        }
        System.out.println("\n------Lista de homens------");
        for (int i = 1; i < nomes.length; i++) {
            if (sexo[i] == 'm' || sexo[i] == 'M') {
                System.out.println("-" + nomes[i]);
            }
        }
    }
}
