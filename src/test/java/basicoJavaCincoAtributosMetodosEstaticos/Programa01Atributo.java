package basicoJavaCincoAtributosMetodosEstaticos;

public class Programa01Atributo {
    private int numero;
    private String cliente;

    public static int contador = 1;

    public Programa01Atributo(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        Programa01Atributo.contador = Programa01Atributo.contador + 1;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public static int proximaConta() {
        return Programa01Atributo.contador;
    }
}
