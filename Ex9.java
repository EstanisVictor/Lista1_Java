
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int hora = teclado.nextInt(), min = teclado.nextInt(), seg = teclado.nextInt(), total;
        total = (hora*3600);
        total+=(min*60);
        System.out.println(total+=seg);
    } 
}