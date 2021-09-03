
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num = teclado.nextInt(), soma=0;
        while(num!=0){
            soma+=num;
            num = teclado.nextInt();
        }
        System.out.println(soma);
    } 
}