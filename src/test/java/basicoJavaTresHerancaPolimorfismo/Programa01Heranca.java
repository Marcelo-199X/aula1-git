package basicoJavaTresHerancaPolimorfismo;

public class Programa01Heranca {

    public static void main(String[] args) {

        //Programa01ClassePessoa p1 = new Programa01ClassePessoa("Marcelo Souza", 1994, "marcelo@teste.com");
        //System.out.println(p1);
        //System.out.println("");
        //System.out.println(p1.getNome() + " " + p1.getAnoNascimento());

        Programa01ClasseAluno a1 = new Programa01ClasseAluno("Vitoria Vieira",2004, "73422839", "vitoria@teste.com");
        System.out.println(a1);
        System.out.println("");
        //System.out.println(a1.getNome());

        a1.mensagem("Classe Abstrata");

        Programa01ClasseProfessor prof1 = new Programa01ClasseProfessor("Pepi", 1870, "434894", "pepi@teste.com");
        System.out.println(prof1);
        //System.out.println(prof1.getNome());
    }
}
