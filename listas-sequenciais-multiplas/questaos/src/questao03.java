import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        int mes = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
        System.out.print("Digite o numero de um mês: ");
        mes = in.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Mês: Janeiro");
                break;
            case 2:
                System.out.println("Mês: Fevereiro");
                break;
            case 3:
                System.out.println("Mês: Março");
                break;
            case 4:
                System.out.println("Mês: Abril");
                break;
            case 5:
                System.out.println("Mês: Maio");
                break;
            case 6:
                System.out.println("Mês: Junho");
                break;
            case 7:
                System.out.println("Mês: Julio");
                break;
            case 8:
                System.out.println("Mês: Agosto");
                break;
            case 9:
                System.out.println("Mês: Setembro");
                break;
            case 10:
                System.out.println("Mês: Outubro");
                break;
            case 11:
                System.out.println("Mês: Novembro");
                break;
            case 12:
                System.out.println("Mês: Dezembro");
                break;
            default:
                System.out.println("não existe mês com este número");
                break;
        }
    }
}
