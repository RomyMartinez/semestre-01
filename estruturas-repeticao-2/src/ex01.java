import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        int Numeros, TotalPositivo = 0, negativo = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 20; i++) {
            System.out.print("Digite um numero: ");
            Numeros = in.nextInt();
            if (Numeros > 0) {
                TotalPositivo = TotalPositivo + Numeros;
            } else {
                negativo++;
            }
        }
        System.out.print("\nSoma dos positivos: " + TotalPositivo);
        System.out.println("Total de negativos: " + negativo);
    }
}
