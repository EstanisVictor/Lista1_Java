
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int num1 = teclado.nextInt(), num2 = teclado.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print("pifpaf; ");
            }else{
                if (i%3==0) {
                    System.out.print("pif; ");
                }else{
                    if (i%5==0) {
                        System.out.print("paf; ");
                    }
                }
            }
        }
    } 
}