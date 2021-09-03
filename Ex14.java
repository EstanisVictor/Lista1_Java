
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double peso, somaP=0.0;
        int quantPessoa = teclado.nextInt(), idade;
        while(quantPessoa>0){
            idade = teclado.nextInt();
            peso = teclado.nextDouble();
            
            if (idade>30) {
                somaP+=peso;
            }
            quantPessoa--;
        }
        System.out.println(somaP);
    } 
}