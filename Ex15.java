
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int n = teclado.nextInt(), soma=0;
        for (int i = 1; i <=n; i++) {
            if (i%2==1) {
                soma+=i;
            }
        }
        System.out.println(soma);
    } 
}