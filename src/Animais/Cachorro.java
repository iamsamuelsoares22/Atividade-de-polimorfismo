package Animais;
import Tipos.*;

public class Cachorro extends Mamifero {
    
    @Override
    public void locomover(){
        System.out.println("Eu me locomovo correndo ou andando");
    }

    public void emitirSom(){
        System.out.println("Eu emito som latindo");
    }
}
