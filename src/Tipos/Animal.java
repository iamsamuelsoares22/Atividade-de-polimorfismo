package Tipos;

public abstract class Animal {
    
    public void locomover(){
        System.out.println("Eu posso ser terrestre, aquático ou aéreo");
    }

    public void locomover(int velocidade, String terreno){
        System.out.println("Eu sou um animal que me locomovo pelo(a) " + terreno + ", e minha velocidade pode chegar à " + velocidade + "Km/h");
    }

    public void emitirSom(){
        System.out.println("Eu posso emitir sons especiífcos");
    }
}
