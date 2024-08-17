package Tipos;

public class Aves extends Animal {

    @Override
    public void locomover(){
        System.out.println("Tenhos asas, mas posso voar ou não");
    }

    public void emitirSom(String terreno){
        System.out.println("Eu tenho sons especiífcos");
    }
}
