import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) throws Exception {
        char sexo;
        double altura, peso, ideal = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite seu sexo: ");
        sexo = in.nextLine().charAt(1);
        System.out.print("Digite sua altura: ");
        altura = in.nextFloat();
        System.out.print("Digite seu peso: ");
        peso = in.nextFloat();
        if (sexo == 'a' || sexo == 'o') {
            ideal = (72.7 * altura) - 58;
            System.out.println(ideal);
            if (peso < ideal - 1) {
                System.out.println("Abaixo do peso ideal");
            } else {
                if (peso > ideal + 1) {
                    System.out.println("Acima do peso");
                } else {
                    System.out.println("Peso ideal");
                }
            }
        } else {
            ideal = ((62.1 * altura) - 44.7);
            System.out.println(ideal);
            if (peso < ideal  - 1) {
                System.out.println("Abaixo do peso ideal");
            } else {
                if ( peso > ideal + 1) {
                    System.out.println("Acima do peso");
                } else {
                    System.out.println("Peso ideal");
                }
            }
        }
    }
}
