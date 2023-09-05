import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite x: ");
        x = in.nextInt();
        System.out.print("Digite y: ");
        y = in.nextInt();
        System.out.println("x é divisível por y: " + dividir(x,y));
    }
    public static boolean dividir(int x, int y){
        boolean divisivel = false;
        if ((x%y) == 0){
            divisivel = true;
            return divisivel;
        }
        return divisivel;
    }
}
