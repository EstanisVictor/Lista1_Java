
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int n1 = teclado.nextInt(), n2 = teclado.nextInt(), n3 = teclado.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println(n1);
            if (n2>n3) {
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n2);
            }
        }
        if (n2>n1 && n2>n3) {
            System.out.println(n2);
            if (n1>n3) {
                System.out.println(n1);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n1);
            }
        }
        if (n3>n2 && n1<n3) {
            System.out.println(n3);
            if (n1>n2) {
                System.out.println(n1);
                System.out.println(n2);
            }else{
                System.out.println(n2);
                System.out.println(n1);
            }
        }
    } 
}
