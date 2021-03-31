package basicoJavaTresHerancaPolimorfismo;

public class Exercicio1 {
    String nome;
    double salarioBruto, tax, tax2;
    private double salarioBruto2;

    public void imprimir(String nome, double salarioBruto, double tax) {
        System.out.println("\nName: " + this.nome + "\nSalario Bruto: " + this.salarioBruto +
                "\nTax: " + tax);
    }

    public void calculo() {
        this.salarioBruto2 = this.salarioBruto;
        this.salarioBruto = salarioBruto - tax;
        System.out.println("\nFuncionario: " + this.nome + ", $ " + this.salarioBruto);
    }

    public void calculo2() {
        this.salarioBruto = ((this.salarioBruto2 / 100) * this.tax2) + this.salarioBruto;
        System.out.println("\nAtualização de salario: " + this.nome + ", $ " + this.salarioBruto);

    }


}
