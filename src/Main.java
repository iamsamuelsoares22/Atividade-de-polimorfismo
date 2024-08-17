import Tipos.*;
import Animais.*;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Gato();
        Animal an2 = new Jacare();
        Animal animal = new Reptil();
        an1.locomover();
        an1.emitirSom();
        an2.locomover();
        an2.emitirSom();
        animal.locomover(5, "terra");
    }
}
