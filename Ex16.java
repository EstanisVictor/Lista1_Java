
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int base = teclado.nextInt(), expoente = teclado.nextInt(), potencia=1;
        for (int i = 0; i < expoente; i++) {
            potencia*=base;
        }
        System.out.println(potencia);
    } 
}