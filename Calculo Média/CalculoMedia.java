import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    float nota1, nota2, nota3, nota4, media;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite 1º nota: ");
    nota1 = teclado.nextFloat();
    System.out.println("Digite sua 2º nota: ");
    nota2 = teclado.nextFloat();
    System.out.println("Digite sua 3º nota: ");
    nota3 = teclado.nextFloat();
    System.out.println("Digite sua 4º nota: ");
    nota4 = teclado.nextFloat();
    media = (nota1 + nota2 + nota3 + nota4)/4;
    System.out.println("Sua nota é " + media);
    
    if (media >= 7.0){
        System.out.println("Você foi aprovado. Parabéns!");
    }else if (media == 5.0){
        System.out.println("Você está em recuperação");
    }else{
        System.out.println("Você está reprovado");
    }
    
  }
}
