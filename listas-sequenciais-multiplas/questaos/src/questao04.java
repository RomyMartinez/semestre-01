import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
     int planeta;
     Double peso;
     Double pesoPlaneta;
     @SuppressWarnings("resource")
     Scanner in = new Scanner (System.in);
     System.out.print("Digite o numero da terra (1: Mercúrio, 2: Venus, 3: Marte, 4: Jupiter, 5: Saturno, 6: Urano): ");
     planeta = in.nextInt();
     System.out.print("Digite o peso: ");
     peso = in.nextDouble();
     switch (planeta) {
        case 1:
            pesoPlaneta = peso * 0.37 ;
            System.out.println("Peso no planeta Mercúrio : " + pesoPlaneta);
            break;
        case 2:
            pesoPlaneta = peso * 0.88 ;
            System.out.println("Peso no planeta Venus: " + pesoPlaneta);
            break;
        case 3:
            pesoPlaneta = peso * 0.38 ;
            System.out.println("Peso no planeta Marte: " + pesoPlaneta);
            break;
        case 4:
            pesoPlaneta = peso * 2.64;
            System.out.println("Peso no planeta Jupiter: " + pesoPlaneta);
            break;
        case 5:
            pesoPlaneta = peso * 1.15 ;
            System.out.println("Peso no planeta Saturno: " + pesoPlaneta);
            break;
        case 6:
            pesoPlaneta = peso * 1.17;
            System.out.println("Peso no planeta Urano: " + pesoPlaneta);
            break;
     
        default:
            System.out.println("Planeta desconhecido");
            break;
     }
    }
}
