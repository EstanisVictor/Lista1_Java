
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double ava1 = teclado.nextDouble(), ava2 = teclado.nextDouble(), freq = teclado.nextDouble(), media;
        media = (ava1+ava2)/2.0;
        if (((freq/100.0)<0.5) || (ava1<4.0 && ava2<4.0)) {
            System.out.println("reprovado");
        }else{
            if (ava1<4.0 || ava2<4.0 || media<6.0) {
                System.out.println("recuperacao");
            }else{
                System.out.println("aprovado");
            }
        }
    } 
}