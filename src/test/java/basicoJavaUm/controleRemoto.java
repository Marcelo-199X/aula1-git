package basicoJavaUm;

public class controleRemoto {
    String nome;
    int volume = 0;
    int btn = 1;
    int canal = 0;

    void aumentar(String nome) {
        for (int i = 0; i < btn; ++i) {
            volume = volume + 1;
            System.out.println("VOLUME: " + volume);
        }
    }

    void diminuir() {
        for (int i = 0; i < btn; ++i) {
            volume = volume - 1;
            System.out.println("VOLUME: " + volume);
        }
    }

    void canalmais() {
        for (int i = 0; i < btn; ++i) {
            canal = canal + 1;
            System.out.println("CANAL: " + canal);
        }
    }

    void canalmenos() {
        for (int i = 0; i < btn; ++i) {
            canal = canal - 1;
            System.out.println("CANAL: " + canal);
        }
    }

    void consulta() {
        System.out.println("CONSULTA VOLUME: " + volume);
        System.out.println("CONSULTA CANAL: " + canal);
    }
}