
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double peso = teclado.nextDouble(), altura = teclado.nextDouble(), imc;
        imc = peso/Math.pow(altura, 2);
        if (imc<18.5) {
            System.out.println("abaixo do peso");
        }
        if (imc>=18.5 && imc<25) {
            System.out.println("peso normal");
        }
        if (imc>=25 && imc<30) {
            System.out.println("acima do peso");
        }
        if (imc>=30) {
            System.out.println("obeso");
        }
    } 
}
