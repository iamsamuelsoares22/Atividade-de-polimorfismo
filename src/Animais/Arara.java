package Animais;
import Tipos.*;

public class Arara extends Aves{
    
    @Override
    public void locomover(){
        System.out.println("Eu me locomovo voando");
    }

    public void emitirSom(){
        System.out.println("Eu posso emitir som dos tipos palrar, grasnar ou taramelar");
    }
}
