package basicoJavaUm; /*
Faca um programa que receba diversos nomes,
de frutas do usuario e no final imprima esses
frutas em ordem contraria. O programa deve solicitar
ao usuario quantas frutas ele quer informar

informe fruta 1:
manga
informe fruta 2:
uva

uva
manga
 */

 import java.util.Scanner;

 public class Programa11Funcoes {
     static String frutas[];
     static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int qtd;

        System.out.print("Digite a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(ler.nextLine());

        cadastrar_dados(qtd);
        mostrar_dados(qtd);


    }
       /*
       Uma função deve ter o seguinte:
       a) Tipo de retorno (Tipo de dado que a função vai retornar)
       b) Nome;
       c) Parametros/Argumento de entradas (opcional)
       d) Retorno (Opcional - depende do tipo de retorno)
        */
        //void = vazio
       static void cadastrar_dados(int quantidade) {

           frutas = new String[quantidade];

           for(int i = 0; i < quantidade; i++) {
               System.out.println("Digite a " + (i + 1) + " fruta");
               frutas[i] = ler.nextLine();
           }

       }

       static void mostrar_dados(int quantidade) {
           for (int j = (quantidade - 1); j >= 0; j--) { // i = i - 1
               System.out.println("A fruta " + j + " é: " + frutas[j]);
       }

       }

}
