import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        String palavra;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = in.nextLine();
        System.out.print("\n");
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.toUpperCase().charAt(i));
        }
        
    }
}
