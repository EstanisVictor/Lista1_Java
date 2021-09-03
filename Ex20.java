
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        int dias = teclado.nextInt(), quantProduzPeriodo, menorProducao=99999999, maiorProducao=0, mediaDiaria, soma=0;
        for (int i = 0; i < dias; i++) {
            quantProduzPeriodo = teclado.nextInt();
            soma+=quantProduzPeriodo;
            if (quantProduzPeriodo>maiorProducao) {
                maiorProducao = quantProduzPeriodo;
            }
            if (quantProduzPeriodo<menorProducao) {
                menorProducao = quantProduzPeriodo;
            }
        }
        mediaDiaria = soma/dias;
        System.out.println("Quantidade produzida nos "+dias+" dias: "+soma);
        System.out.println("Media diaria de producao: "+mediaDiaria);
        System.out.println("Menor producao diaria: "+menorProducao);
        System.out.println("Maior producao diaria: "+maiorProducao);
    } 
}