package basicoJavaCincoAtributosMetodosEstaticos;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculos n1 = new Calculos();

        System.out.println("Digite o nome do aluno: ");
        n1.nome = ler.nextLine();

        System.out.println("Digite nota 1: ");
        n1.nota1 = ler.nextDouble();
        System.out.println("Digite nota 2: ");
        n1.nota2 = ler.nextDouble();
        System.out.println("Digite nota 3: ");
        n1.nota3 = ler.nextDouble();

        n1.calculo();

    }
}
