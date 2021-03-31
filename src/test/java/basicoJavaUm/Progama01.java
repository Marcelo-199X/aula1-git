package basicoJavaUm;//Variaveis e if/Else

import java.util.Scanner;

public class Progama01 {

    public static void main(String[] args) {

          int valor;
          int num1, num2, num3;
          int num4, num5 = 4, num6 = 7, num8;
          int idade = 27;

          char caractere;
          float _valor1 = 34.2f;
          double _valor2 = 34.2;

          Scanner ler = new Scanner(System.in);

          System.out.println ("Digite um valor: ");
          num1 = ler.nextInt();

          if (num1 > 5) {
              System.out.println("Sim, o numero " + num1 + " é maior que 5");
          } else if (num1 == 5){
              System.out.println("O numero " + num1 + " é igual a 5");
          } else if (num1 % 2 == 0){
              System.out.println ("Sim o numero " + num1 + " é par");
          }
          else {
              System.out.println("Não o numero " + num1 + " não é maior que 5");
          }


    }

}
