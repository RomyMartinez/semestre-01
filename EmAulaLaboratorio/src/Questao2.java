import java.util.Scanner;

public class Questao2 {
	public static void main(String[]args){
		int num1, num2, contador, resto, resto2;
    	@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
    	System.out.print("Digite um numero: ");
    	num1 = in.nextInt();
    	System.out.print("Digite o segundo numero: ");
    	num2 = in.nextInt();
    	if (num1 < num2){
    	   contador = num1;
    	} else {
    		if (num2 < num1){
    			contador = num2;	
    		} else{
    			contador = num1;
    		}
    	}
    	while(contador > 1){
    		resto = num1%contador;
    		resto2 = num2%contador;
    		System.out.println("Resto de "+ num1 + " com numero " + contador + ": " + resto);
    		System.out.println("Resto de "+ num2 + " com numero " + contador + ": " + resto2);
    		contador --;
    	}
    }
}