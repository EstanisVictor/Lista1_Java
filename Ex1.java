
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int n1, n2, n3, n4, menor=99999;
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        n4 = teclado.nextInt();
        if (n1<menor) {
            menor=n1;
        }
        if (n2<menor) {
            menor=n2;
        }
        if (n3<menor) {
            menor=n3;
        }
        if (n4<menor) {
            menor=n4;
        }
        System.out.println(menor);
    } 
}
