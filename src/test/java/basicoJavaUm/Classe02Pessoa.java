package basicoJavaUm;// Classe
// Atributos
// Construtor

public class Classe02Pessoa {

    String nome, email;
    int ano_nascimento;

    // Construtor vazio
    public Classe02Pessoa() {

    }
     // Construtor com Parametro
    public Classe02Pessoa(String nome, String email, int ano_nascimento) {
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informação() {
        System.out.println("========= Pessoa =========");
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.ano_nascimento);
    }
}
