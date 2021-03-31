package basicoJavaTresHerancaPolimorfismo;

//Classa aluno herda informações da classe Pessoa
//Aluno é pessoa
public class Programa01ClasseAluno extends Programa01ClassePessoa{

    private String ra;

    public Programa01ClasseAluno(String nome, int anoNascimento, String ra, String email){
        super(nome, anoNascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String toString() {
        return super.toString() + "\nR.A : " + this.ra;
    }

    public void mensagem(String texto) {
        System.out.println(texto);
    }
}
