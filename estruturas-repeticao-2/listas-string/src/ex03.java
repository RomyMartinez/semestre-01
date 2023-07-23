import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int numero;
        String nome, nacionalidade, mulherLeve = "", pessoaPesada, nacionalidadeLeve = "", nacionalidadePesada;
        char sexo;
        float peso, maisPesada, maisLeve = 1000, media, total;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero de pessoas: ");
        numero = in.nextInt();
        in.nextLine();
        System.out.print("Digite o nome: ");
        nome = in.nextLine();
        System.out.print("Digite o sexo: ");
        sexo = in.nextLine().charAt(0);
        System.out.print("Digite o peso: ");
        peso = in.nextFloat();
        in.nextLine();
        System.out.print("Digite a nacionalidade: ");
        nacionalidade = in.nextLine();
        pessoaPesada = nome;
        maisPesada = peso;
        total = peso;
        nacionalidadePesada = nacionalidade;
        if (sexo == 'F' || sexo == 'f') {
            mulherLeve = nome;
            maisLeve = peso;
        }
        for (int i = 1; i <= numero - 1; i++) {
            System.out.print("Digite o nome: ");
            nome = in.nextLine();
            System.out.print("Digite o sexo: ");
            sexo = in.nextLine().charAt(0);
            System.out.print("Digite o peso: ");
            peso = in.nextFloat();
            in.nextLine();
            System.out.print("Digite a nacionalidade: ");
            nacionalidade = in.nextLine();
            total = total + peso;
            if ((sexo == 'f' || sexo == 'F') && peso < maisLeve) {
                mulherLeve = nome;
                maisLeve = peso;
                nacionalidadeLeve = nacionalidade;
                if (peso > maisPesada) {
                    maisPesada = peso;
                    pessoaPesada = nome;
                    nacionalidadePesada = nacionalidade;
                }
            } else {
                if (peso > maisPesada) {
                    maisPesada = peso;
                    pessoaPesada = nome;
                    nacionalidadePesada = nacionalidade;
                }
            }
        }
        media = total / numero;
        System.out.println("\nMedia dos pesos: " + media);
        System.out.println("Pessoa mais pesada: " + pessoaPesada + " do " + nacionalidadePesada);
        System.out.println("Mulher mais leve: " + mulherLeve + " do " + nacionalidadeLeve);
    }
}
