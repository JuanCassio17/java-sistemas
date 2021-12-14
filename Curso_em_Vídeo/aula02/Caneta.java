package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A ponta dela é: " + this.ponta);
        System.out.println("A carga dela é: " + this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar");
            
        }else {
            System.out.println("Estou rabiscando");
        }
        
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampar(){
        this.tampada = false;
        
    }
}
