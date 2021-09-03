
import java.io.BufferedInputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        double altura1 = teclado.nextDouble(), altura2 = teclado.nextDouble(), 
                altura3 = teclado.nextDouble(), altura4 = teclado.nextDouble(), maior=0.0, menor = 999999.0, media;
        media = (altura1+altura2+altura3+altura4)/4.0;
        if (altura1>maior) {
            maior = altura1;
        }
        if (altura2>maior) {
            maior = altura2;
        }
        if (altura3>maior) {
            maior = altura3;
        }
        if (altura4>maior) {
            maior = altura4;
        }
        if (altura1<menor) {
            menor=altura1;
        }
        if (altura2<menor) {
            menor=altura2;
        }
        if (altura3<menor) {
            menor = altura3;
        }
        if(altura4<menor){
            menor = altura4;
        }
        DecimalFormat formatado = new DecimalFormat("0.0");
        formatado.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println("Maior altura: "+maior+" metros");
        System.out.println("Menor altura: "+menor+" metros");
        System.out.println("Altura media: "+formatado.format(media)+" metros");
    } 
}