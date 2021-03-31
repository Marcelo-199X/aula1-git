package basicoJavaUm;

import java.util.Scanner;

public class Televisao {
     Scanner ler = new Scanner(System.in);

    void validar(int lig) {
        if(lig == 1) {
            System.out.println("TV LIGADA");
        }else if (lig == 7) {
            System.out.println("TV DESLIGADA");
        }
    }
}
