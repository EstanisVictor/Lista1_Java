
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num = teclado.nextInt(),num2 = teclado.nextInt(), div;
        while(num2==0){
            num2 = teclado.nextInt();
        }
        System.out.println(div = num/num2);
    } 
}