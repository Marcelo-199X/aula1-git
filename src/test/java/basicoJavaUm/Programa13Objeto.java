package basicoJavaUm;

public class Programa13Objeto {

    public static void main(String[] args) {

        //Declaração e instanciacao/iniciacao do objeto
        //p0 e p1 -> instancia do objeto / objeto
        //Construtor
        Classe01Produto p0 = new Classe01Produto();

        Classe01Produto p1 = new Classe01Produto();
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("======== Produto ========");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "%");

        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.println("======== Produto ========");
        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + "%");

        Classe02Pessoa pessoa1 = new Classe02Pessoa();
        pessoa1.nome = "Marcelo";
        pessoa1.email = "teste@gmail.com";
        pessoa1.ano_nascimento = 1990;

        System.out.println("========== Pessoa =========");
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.email);
        System.out.println(pessoa1.ano_nascimento);

        Classe02Pessoa met = new Classe02Pessoa("MARCELO", "TESTE@TESTE.COM", 1980 );

        met.imprime_informação();

    }
}
