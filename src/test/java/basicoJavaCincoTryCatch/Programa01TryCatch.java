package basicoJavaCincoTryCatch;

// try = tente fazer isso
// catch = caso de um erro de exceção exibir uma msg pro usuario
public class Programa01TryCatch {

    public static void main(String[] args) {

        int numero[] = new int[5];

        for(int i = 0; i < numero.length; ++i) {
            numero[i] = (i + 3) * 2;
        }
        for(int i = 0; i <= numero.length; ++i) {
            try { // tente fazer isso
                System.out.println(numero[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array invalido");
            }

        }
    }
}
