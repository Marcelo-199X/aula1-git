package basicoJavaTresHerancaPolimorfismo;

public class MainTreinamento {

    public static void main(String[] args) {

        TrinamentoInicio tit = new TrinamentoInicio();
        tit.treinoDiario();
        TreinamentoFinal tft = new TreinamentoFinal();
        tft.treinoDiario();
    }
}
