import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        String sexo, nome;
        int feminino = 0, masculino = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = in.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o sexo: ");
            sexo = in.nextLine();
            if (sexo.equalsIgnoreCase("feminino")) {
                feminino++;
            } else {
                if (sexo.equalsIgnoreCase("masculino")) {
                    masculino++;
                } else {
                    System.out.println("Verifique a ortografia, digite novamente");
                    i--;
                }
            }
        }
        System.out.println(nome + " o numero de mulheres e homens é: ");
        System.out.println("Numero de homens: " + masculino);
        System.out.println("Numero de mulheres: " + feminino);

    }
}
