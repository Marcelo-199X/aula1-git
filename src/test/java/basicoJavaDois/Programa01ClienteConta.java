package basicoJavaDois;

public class Programa01ClienteConta {

    public static void main(String[] args) {

        Cliente joao = new Cliente("João", "Rua Joka");
        Cliente maria = new Cliente("Maria", "Rua Joka");

        Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
        Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);

        System.out.println("Saldo: " + joao.nome + " " + conta_joao.getSaldo());

        conta_joao.sacar(200f);
        System.out.println("Saldo: " + joao.nome + " " + conta_joao.getSaldo());


    }
}
