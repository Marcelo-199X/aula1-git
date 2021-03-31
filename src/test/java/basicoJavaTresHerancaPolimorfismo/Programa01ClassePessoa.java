package basicoJavaTresHerancaPolimorfismo;

/*
- Classe abstrata:
 -atributos
 -Metodos
 -Metodos abstratos
 */

public abstract class Programa01ClassePessoa {
    private String nome;
    private int anoNascimento;
    private String email;

    public Programa01ClassePessoa(String nome, int anoNascimento, String email) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nAno de Nascimento: " + this.anoNascimento;
    }

    public abstract void mensagem(String texto);
}
