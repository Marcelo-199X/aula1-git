package basicoJavaTresHerancaPolimorfismo;

public class Programa01ClasseProfessor extends Programa01ClassePessoa {
    private String matricula;

    public Programa01ClasseProfessor(String nome, int anoNascimento, String matricula, String email) {
        super(nome, anoNascimento, email);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return super.toString() + "\nMatricula: " + this.matricula;
    }

    public void mensagem(String texto) {
        System.out.println(texto);
    }
}
