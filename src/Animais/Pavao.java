package Animais;
import Tipos.*;

public class Pavao extends Aves{
    
    @Override
    public void locomover(){
        System.out.println("Eu tenho asas, mas não voou");
    }

    public void emitirSom(){
        System.out.println("Eu posso emitir som do tipo pupilar ou piar");
    }
}
