
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num = teclado.nextInt(), fatorial = num;
        for (int i = 1; i < num; i++) {
            fatorial = fatorial*(num-i);
        }
        System.out.println(fatorial);
    } 
}