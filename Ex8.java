
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double n1 = teclado.nextDouble(), n2 = teclado.nextDouble(), 
                n3 = teclado.nextDouble(), n4 = teclado.nextDouble(), media;
        media = (n1+n2+n3+n4)/4.0;
        if (media>=7) {
            System.out.println("aprovado");
        }
        if (media>=5 && media<7) {
            System.out.println("recuperacao");
        }
        if (media<5) {
            System.out.println("reprovado");
        }
    } 
}