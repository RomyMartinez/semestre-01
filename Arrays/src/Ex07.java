import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int[] Produtos = new int[4];
        float[] Preco = new float[4];
        float arrecadado, total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("------Inserindo os Produtos------");
        for (int i = 1; i < Produtos.length; i++) {
            System.out.printf("Preço do produto %d: ",i);
            Preco[i] = in.nextFloat();
            System.out.print("Quantidades do produto: ");
            Produtos[i] = in.nextInt();
        }
        System.out.println("\n------Valores arrecadados de cada produto------");
        for (int i = 1; i < Preco.length; i++) {
            arrecadado = Preco[i] * Produtos[i];
            total = total + arrecadado;
            System.out.printf("Valor arrecadado do produto %d: %.2f \n", i, arrecadado);
        }
        System.out.println("\nTotal arrecadado: " + total);
    }
}
