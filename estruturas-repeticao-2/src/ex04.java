import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        float MaiorAltura, MenorAltura, MediaMulher, MediaAltura, altura, totalM = 0, total = 0;
        char Sexo;
        int Mulheres = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o sexo: ");
        Sexo = in.nextLine().charAt(0);
        System.out.print("Digite a altura");
        altura = in.nextFloat();
        in.nextLine();
        MaiorAltura = altura;
        MenorAltura = altura;
        total = total + altura;
        if (Sexo == 'F' || Sexo == 'f') {
            totalM = totalM + altura;
        }
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o sexo: ");
            Sexo = in.nextLine().charAt(0);
            System.out.print("Digite a altura: ");
            altura = in.nextFloat();
            in.nextLine();
            total = total + altura;
            if (Sexo == 'F' || Sexo == 'f') {
                totalM = totalM + altura;
                Mulheres++;
            }
            if (altura > MaiorAltura) {
                MaiorAltura = altura;
            } else {
                if (altura < MenorAltura) {
                    MenorAltura = altura;
                }
            }
        }
        MediaAltura = total / 5;
        MediaMulher = totalM / Mulheres;
        System.out.println("Maior altura: " + MaiorAltura);
        System.out.println("Menor altura: " + MenorAltura);
        System.out.println("Media das alturas: " + MediaAltura);
        System.out.println("Media das mulheres: " + MediaMulher);
    }
}
