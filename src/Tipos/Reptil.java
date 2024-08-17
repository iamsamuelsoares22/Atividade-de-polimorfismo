package Tipos;

public class Reptil extends Animal {
    
    @Override
    public void locomover(){
        System.out.println("Eu posso me locomover por meio do rastejamento ou roçando o ventre no solo");
    }

    public void emitirSom(String terreno){
        System.out.println("Eu posso emitir sons especiífcos");
    }
}
