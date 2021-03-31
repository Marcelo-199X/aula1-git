package basicoJavaUm;

public class Programa08Vetores {

    public static void main(String[] args) {

        int numeros[] = new int[10];
        System.out.println("O vetor é de " + numeros.length + " numeros");

        for(int i = 0; i < numeros.length; ++i) {
            numeros[i] = i + 3;
        }
        System.out.println("O primeiro indice do vetor é: " + numeros[0]);
        System.out.println("O ultimo indice do vetor é: " + numeros[9]);

        for(int i = 0; i < numeros.length; ++i) {
            // Math.round = arrendodamento
            // Math.random = 0...1 double
            numeros[i] = (int) Math.round(Math.random() * 10);
        }

        for (int i: numeros) {
            System.out.println(i + " foreach");
        }
    }
}
