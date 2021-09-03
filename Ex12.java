
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num = teclado.nextInt(),num2 = teclado.nextInt(), soma=0;
        while(num!=0 || num2!=0){
            soma+=(num+num2);
            System.out.println(soma);
            num = teclado.nextInt();
            num2 = teclado.nextInt();
            soma=0;
        }
    } 
}