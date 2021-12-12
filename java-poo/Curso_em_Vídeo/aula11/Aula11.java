package aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("jevenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        Aluno a1 = new Aluno();
        a1.setNome("claudio");
        a1.setMatricula(1111);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(111222);
        b1.setNome("jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("m");
        b1.pagarMensalidade();
        
    }
    
}
