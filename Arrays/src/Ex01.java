import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        String[] nomes = new String[51];
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < nomes.length; i++) {
            System.out.printf("Digite o nome %d: ", i);
            nomes[i] = in.nextLine();
        }
        System.out.print("\n ------Lista inversa------ \n");
        for (int i = nomes.length - 1; i > 0; i--) {
            System.out.println(nomes[i]);
        }
        System.out.println("");
    }
}
