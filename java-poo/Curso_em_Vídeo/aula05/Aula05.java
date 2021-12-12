package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        p1.depositar(500);
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        ContaBanco p3 = new ContaBanco();
        p3.setSaldo(15.000f);
        p3.estadoAtual();
        
        
    }
    
}
