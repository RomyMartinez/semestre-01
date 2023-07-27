import java.util.Scanner;

public class Questao1 {
        public static void main(String[]args){
        	int numero, contador, resto;
        	@SuppressWarnings("resource")
        	Scanner in = new Scanner (System.in);
        	System.out.print("Digite um numero: ");
        	numero = in.nextInt();
        	contador = numero;
        	while(contador > 0){
        		resto = numero%contador;
        		System.out.println("Resto com numero " + contador + ": " + resto);
        		contador --;
        	}
        }
}
