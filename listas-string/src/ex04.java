import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        String palavra1, palavra2;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        palavra1 = in.nextLine();
        System.out.print("Digite a segunda palavra: ");
        palavra2 = in.nextLine();
        if (palavra1.length() > palavra2.length()) {
            System.out.println("\nMenor palavra: " + palavra2);
        } else {
            if (palavra2.length() > palavra1.length()) {
                System.out.println("\nMenor palavra: " + palavra1);
            } else {
                System.out.println("\nAs duas palavras tem o mesmo tamanho: " + palavra1 + " e " + palavra2);
            }
        }
    }
}
