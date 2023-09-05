import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int letra;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um parametro: ");
        letra = in.nextInt();
        System.out.println("Letra dentro do alfabeto: " + contem((char)letra));
    }
    public static boolean contem(char letra){
        boolean Dentro = false;
        char[] Alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        for (int i = 0; i < Alfabeto.length; i++) {
            if (letra == Alfabeto[i]) {
                Dentro = true;
                return Dentro;
            }
        } 
        return Dentro;
    }
}