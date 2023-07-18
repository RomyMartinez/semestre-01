public class ex08 {
    public static void main(String[] args) {
        int soma = 0, i = 1;
        while (i < 1000) {
            if (i % 5 == 0 || i % 3 == 0) {
                soma = soma + i;
            }
            i++;
        }
        System.out.println("Soma total: " + soma);
    }
}
