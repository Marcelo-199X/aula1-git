package basicoJavaCincoAtributosMetodosEstaticos;

public class Programa01Main {

    public static void main(String[] args) {

        Programa01Atributo c1 = new Programa01Atributo("Marcelo Souza");
        System.out.println(c1.getNumero() + " - " + c1.getCliente());
        Programa01Atributo c2 = new Programa01Atributo("Mayara Araujo");
        System.out.println(c2.getNumero() + " - " + c2.getCliente());

    }
}
