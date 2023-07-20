import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        float altura, alturaMaior, alturaMenor, media, total = 0;
        String nome, nomeMaior, nomeMenor;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = in.nextLine();
        System.out.print("Digite a altura: ");
        altura = in.nextFloat();
        in.nextLine();
        alturaMaior = altura;
        alturaMenor = altura;
        nomeMaior = nome;
        nomeMenor = nome;
        total = altura;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Digite o nome: ");
            nome = in.nextLine();
            System.out.print("Digite a altura: ");
            altura = in.nextFloat();
            in.nextLine();
            total = total + altura;
            if (altura > alturaMaior) {
                alturaMaior = altura;
                nomeMaior = nome;
            } else {
                if (altura < alturaMenor) {
                    alturaMenor = altura;
                    nomeMenor = nome;
                }
            }
        }
        media = total / 3;
        System.out.println("\nMedia das alturas: " + media + "");
            System.out.println(nomeMenor + " tem a menor altura com " + alturaMenor + "m");
            System.out.println(nomeMaior + " tem a maior altura com " + alturaMaior + "m\n");
    }
}
