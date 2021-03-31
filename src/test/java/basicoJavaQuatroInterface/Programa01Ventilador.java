package basicoJavaQuatroInterface;

public class Programa01Ventilador implements IEletronico {
    private boolean ligado = false;
    public void ligar() {
       if(!this.ligado) {
           this.ligado = true;
           System.out.println("LIGUEI A TV");
       }
    }

    public void desligar() {
        if(this.ligado) {
            this.ligado = false;
            System.out.println("DESLIGUEI A TV");
        }
    }
}
