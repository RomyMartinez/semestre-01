import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        int Idade;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        Idade = in.nextInt();
        switch (Idade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Idade insuficiente");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Infantil A");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Infantil B");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Juvenil A");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Juvenil B");
                break;
            default:
                System.out.println("Adulto");
                break;
        }
    }
}
