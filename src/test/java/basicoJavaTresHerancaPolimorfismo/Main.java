package basicoJavaTresHerancaPolimorfismo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lew = new Scanner(System.in);
        Exercicio1 func = new Exercicio1();

        System.out.println("Digite o nome do funcionario:");
        func.nome = lew.nextLine();

        System.out.println("Digite o Salario Bruto: ");
        func.salarioBruto = lew.nextDouble();

        System.out.println("Digite o imposto");
        func.tax = lew.nextDouble();

        func.imprimir(func.nome, func.salarioBruto, func.tax);
        func.calculo();

        System.out.println("Digite a porcentagem para aumento: ");
        func.tax2 = lew.nextDouble();

        func.calculo2();

    }

}
