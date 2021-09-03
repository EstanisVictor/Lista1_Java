
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num = teclado.nextInt();
        if (num%2==0 && num%5==0) {
            num+=5;
        }else{
            if (num%2==1) {
                num+=8;
            }
        }
        System.out.println(num);
    } 
}