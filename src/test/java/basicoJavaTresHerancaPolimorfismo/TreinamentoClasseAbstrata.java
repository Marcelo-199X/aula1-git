package basicoJavaTresHerancaPolimorfismo;
//Template Method
public abstract class TreinamentoClasseAbstrata {

    public final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();
    public abstract void jogoTreino();
    public final void treinoTatico() {
        System.out.println("Treino Tatico...");
    };
}
