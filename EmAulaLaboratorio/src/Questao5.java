import java.util.Scanner;

public class Questao5 {
	public static void main(String[]args){
		int num1, num2, contador, resto, resto2, Zeros = 0;
    	@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
    	do {
    	System.out.print("Digite o primeiro numero: ");
    	num1 = in.nextInt();
    	System.out.print("Digite o segundo numero: ");
    	num2 = in.nextInt();
    	if (num1 < num2){
    	   contador = num1;
    	} else {
    	   contador = num2;
    	}
    	if (contador <= 2){
    		System.out.println("Os dois numeros tem que ser maior que 2, digite novamente");
    	}
    	}while (contador <=2);
    	while(contador > 1){
    		resto = num1%contador;
    		resto2 = num2%contador;
    		if (resto == 0 && resto2 ==0 && resto == resto2){
    			Zeros++;
    		}
    		contador --;
    	}
    	if (Zeros == 0){
    		System.out.println("Numeros primos entre si");
    	} else {
    		System.out.println("N�o s�o numeros primos entre si");
    	}
 }
}
