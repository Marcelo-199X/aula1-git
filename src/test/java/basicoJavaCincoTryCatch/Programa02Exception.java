package basicoJavaCincoTryCatch;

import java.util.Scanner;

public class Programa02Exception {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe n1: ");
        int n1 = ler.nextInt();
        System.out.println("Informe n2: ");
        int n2 = ler.nextInt();

        try {
            System.out.println(divisao(n1,n2));
        }catch (Exception e) {
            System.out.println("Ocorreu uma exceção");
        }


    }

    public static int divisao(int n1, int n2) throws Exception {
        return n1 / n2;
    }

}
