package basicoJavaUm;

import java.util.Scanner;

public class Programa03Switch {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite o valor de numero: ");
        numero = ler.nextInt();

        switch (numero) {

            case 1:
                System.out.println ("O valor do numero é 1");
                break;
            case 3:
                System.out.println("O valor de numero é 3");
                break;
            default:
                System.out.println("O valor do numero é: " + numero);
                break;
        }


    }
}
