
import java.io.BufferedInputStream;
import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        String sigla = teclado.nextLine().trim();
        if (sigla.toUpperCase().equals("RJ")) {
            System.out.println("carioca");
        }else{
            if (sigla.toUpperCase().equals("SP")) {
                System.out.println("paulista");
            }else{
                if (sigla.toUpperCase().equals("MG")) {
                    System.out.println("mineiro");
                }else{
                    if (sigla.toUpperCase().equals("RN")) {
                        System.out.println("potiguar");
                    }else{
                        if (sigla.toUpperCase().equals("ES")) {
                            System.out.println("capixaba");
                        }else{
                            if (sigla.toUpperCase().equals("RS")) {
                                System.out.println("gaucho");
                            }else{
                                if (sigla.toUpperCase().equals("SC")) {
                                    System.out.println("catarino");
                                }else{
                                    System.out.println("outro estado");
                                }
                            }
                        }
                    }
                }
            }
        }
    } 
}
