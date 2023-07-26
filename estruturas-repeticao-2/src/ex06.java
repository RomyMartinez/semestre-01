import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int escolha;
        float altura, base, raio, area;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Calcular a area do quadrado");
        System.out.println("2 - Calcular a area do retângulo");
        System.out.println("3 - Calcular a area do triangulo");
        System.out.println("4 - Calcular a area do circulo");
        System.out.println("5 - Sair do algorítimo\n");
        do {
            System.out.print("Digite uma das opções: ");
            escolha = in.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o comprimento do quadrado: ");
                    base = in.nextFloat();
                    System.out.print("Digite a largura do quadrado : ");
                    altura = in.nextFloat();
                    area = altura*base;
                    System.out.println("Area: " + area);
                    break;
                case 2:
                    System.out.print("Digite o comprimento do retângulo: ");
                    base = in.nextFloat();
                    System.out.print("Digite a largura do retângulo: ");
                    altura = in.nextFloat();
                    area = altura*base;
                    System.out.println("Area: " + area);
                    break;
                case 3:
                    System.out.print("Digite a altura do triangulo: ");
                    altura = in.nextFloat();
                    System.out.print("Digite a base do triangulo: ");
                    base = in.nextFloat();
                    area = (altura*base)/2;
                    System.out.println("Area: " + area);
                    break;
                case 4:
                    System.out.print("Digite o raio do circulo: ");
                    raio = in.nextFloat();
                    area = (float) (3.14 * raio * raio);
                    System.out.println("Area: " + area);
                    break;
                case 5:
                    System.out.println("Você está saindo do programa");
                    escolha = 5;
                    break;

                default:
                    System.out.println("Verifique se a opção escolhida está digitada corretamente");
                    break;
            }
        } while (escolha != 5);
    }
}
