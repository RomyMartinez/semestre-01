import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        String palavra1, palavra2;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        palavra1 = in.nextLine();
        System.out.print("Digite a segunda palavra: ");
        palavra2 = in.nextLine();
        System.out.println("\nComprimento da primeira palavra: " + palavra1.length());
        System.out.println("Comprimento da segunda palavra: " + palavra2.length());
        if (palavra1.length() == palavra2.length()) {
            System.out.println("\nAs duas palavras tem o mesmo comprimento");
        } else {
            System.out.println("\nAs duas palavras não tem o mesmo comprimento");
        }
        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As duas palavras são iguais");
        } else {
            System.out.println("As duas palavras não são iguais");
        }

    }
}
