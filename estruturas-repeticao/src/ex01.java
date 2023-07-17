import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        float numeros, soma = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite umn numero");
            numeros = in.nextFloat();
            soma = numeros + soma;
        }
        System.out.println("Soma total: " + soma);
    }
}
