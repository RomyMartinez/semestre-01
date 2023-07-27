import java.util.Scanner;

public class Questao3 {
	public static void main(String[]args){
		int num1, num2, contador, resto, resto2, Zeros = 0;
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
    		if (resto == 0 && resto2 ==0 && resto == resto2){
    			Zeros++;
    		}
    		contador --;
    	}
    	System.out.println("Os dois numeros dão resto zero pelo mesmo divisor: " + Zeros);
    }
}
