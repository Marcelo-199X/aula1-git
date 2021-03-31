package basicoJavaCincoAtributosMetodosEstaticos;

public class Calculos {

    public double nota1, nota2, nota3 ,soma, rest;
    public String nome;

    public void calculo() {
        this.soma = nota1 + nota2 + nota3;

        System.out.println("Final Grade: " + this.soma);
        if(this.soma >= 60.0) {
            System.out.println("PASS");
        } else {
            this.rest = 60.0 - this.soma;
            System.out.println("FAILED\nMISSING " + this.rest + " POINTS");
        }
    }
}
