package basicoJavaUm;

import java.util.Scanner;

public class Programa06ForEach {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;

        System.out.println("Digite um nome:");
        nome = ler.nextLine();

        for (char letra : nome.toCharArray()) {

            System.out.print(letra);
        }
    }
}
