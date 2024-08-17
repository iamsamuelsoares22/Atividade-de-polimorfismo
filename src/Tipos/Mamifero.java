package Tipos;

public class Mamifero extends Animal {
    
    @Override
    public void locomover(){
        System.out.println("Eu posso me locomover andando, correndo, saltando, rastejando ou voando");
    }

    public void emitirSom(String terreno){
        System.out.println("Eu posso emitir sons especiífcos");
    }

}
