package basicoJavaUm;

import java.util.Scanner;

public class Programa04While {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade = 1;
        String nome;

        while (idade > 0) {

            System.out.println("Digite o seu nome: ");
            nome = ler.nextLine();

            System.out.println("Digite a sua idade: ");
            idade = Integer.parseInt(ler.nextLine());

            System.out.println(nome + " tem " + idade + " anos \n");
        }

        /* do while
        do {
         System.out.println("Digite o seu nome: ");
            nome = ler.nextLine();

            System.out.println("Digite a sua idade: ");
            idade = Integer.parseInt(ler.nextLine());

            System.out.println(nome + " tem " + idade + " anos \n");
           } while (idade > 0);

         */
    }
}
