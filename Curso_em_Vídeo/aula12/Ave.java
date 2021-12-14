package aula12;
public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo futras e legumes");
    }

    @Override
    public void emitirSom() {
        System.out.println("AAAAAAH");
    }
    
    public void fazerNinho() {
        System.out.println("fazendo ninho para acolher as crias");
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
