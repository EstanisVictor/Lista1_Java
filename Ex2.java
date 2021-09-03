
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double salarioBruto = teclado.nextDouble(), prestacao = teclado.nextDouble();
        if (prestacao>(salarioBruto*0.3)) {
            System.out.println("nao");
        }else{
            System.out.println("sim");
        }
    } 
}
