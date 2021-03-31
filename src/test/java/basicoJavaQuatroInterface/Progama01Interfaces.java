package basicoJavaQuatroInterface;

// Interface é um contrato

public class Progama01Interfaces {

    public static void main(String[] args) {
        Programa01Ventilador vent = new Programa01Ventilador();

        System.out.println("A marca do aparelho é: " + vent.MARCA);

        vent.desligar();
        vent.ligar();
        vent.desligar();

    }
}
