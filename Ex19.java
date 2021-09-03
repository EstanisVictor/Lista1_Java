
import java.io.BufferedInputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class Ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double altura, maior=0.0, menor=99999999.0, soma=0.0, cont=0.0,
               maior1=0.0, maior2=0.0, maior3=0.0, menor1=0.0, menor2=0.0, menor3=0.0;
        for (int delegacao = 0; delegacao < 3; delegacao++) {
            for (int atleta = 0; atleta < 4; atleta++) {
                altura = teclado.nextDouble();
                if (altura>maior) {
                    maior=altura;
                }
                if (altura<menor) {
                    menor = altura;
                }
                soma+=altura;
                cont++;
            }
            if (delegacao==0) {
                maior1 = maior;
                menor1 = menor;
            }
            if (delegacao==1) {
                maior2 = maior;
                menor2 = menor;
            }
            if (delegacao==2) {
                maior3 = maior;
                menor3 = menor;
            }
            maior = 0.0;
            menor = 99999999.0;
        }
        double media = soma/cont;
        String arredonda = Double.toString(media);
        System.out.println("Maior altura\nDelegacao 1: "+maior1+"\nDelegacao 2: "+maior2+"\nDelegacao 3: "+maior3);
        System.out.println("");
        System.out.println("Menor altura\nDelegacao 1: "+menor1+"\nDelegacao 2: "+menor2+"\nDelegacao 3: "+menor3);
        System.out.println("");
        if (arredonda.length()>3) {
            DecimalFormat formatando = new DecimalFormat("0.00");
            formatando.setRoundingMode(RoundingMode.HALF_UP);
            System.out.println("Altura media: "+formatando.format(media));
        }else{
            System.out.println("Altura media: "+media);
        }       
    } 
}