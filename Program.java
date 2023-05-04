package Algoritmos;

public class Program{
    public static void main(String[] args) {
        int maxSize = 100;
        Bubble bolha = new Bubble(maxSize);
        bolha.insere(77);
        bolha.insere(80);
        bolha.insere(25);
        bolha.insere(36);
        bolha.insere(71);
        bolha.insere(90);
        bolha.mostra();
        System.out.println("f");
        bolha.bolha();
        bolha.mostra();
        

        
    }
}