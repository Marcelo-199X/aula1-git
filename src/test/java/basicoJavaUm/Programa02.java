package basicoJavaUm;// Operador Ternario

import java.util.Scanner;

public class Programa02 {

    public static void main (String[] args) {

        Scanner ler = new Scanner (System.in);

         int valor, numero;

         System.out.println("Digite o valor: ");
         valor = ler.nextInt();

         numero = (valor > 0) ? valor : 7;

         System.out.println (numero);
    }
}
