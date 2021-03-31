package basicoJavaUm;

public class Programa12Funcoes {

    public static void main(String[] args) {

        int valor1 = 6, valor2 = 4, res;

        res = soma(valor1, valor2, "Ola");

        System.out.println("A soma é: " + res);
        System.out.println(mensagem());
    }
    static int soma(int v1, int v2, String msg) {
        System.out.println(msg + "1");
        return v1 + v2;
    }
    static String mensagem(){
        return "Olá Mundo";
    }
}
