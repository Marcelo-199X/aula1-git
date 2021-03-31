package basicoJavaUm;

import java.util.Scanner;

public class Pragrama05For {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;
        String nome;

        for(int i = 0; i < 5; i++) {

            System.out.println("Digite o seu nome: ");
            nome = ler.nextLine();

            System.out.println("Digite a sua idade: ");
            idade = Integer.parseInt(ler.nextLine());

            if(idade > 0) {
                System.out.println(nome + " tem " + idade + " anos\n");
            }
        }
    }
}
