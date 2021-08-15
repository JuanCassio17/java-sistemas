import java.util.Scanner;

public class ContadorMoedas {

    public static void main(String[] args) {
     
        float cinco, dez, vinteCinco, cinquenta, real, total;
        float cincox, dezx, vinteCincox, cinquentax, realx, nota;
        cinco = 0.05f;
        dez = 0.10f;
        vinteCinco = 0.25f;
        cinquenta = 0.50f;
        real = 1.00f;
        System.out.println("----- CONTADOR DE MOEDA -----");
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantas moedas de 5 centavos? ");
        cincox = leitor.nextFloat();
        System.out.print("Quantas moedas de 10 centavos? ");
        dezx = leitor.nextFloat();
        System.out.print("Quantas moedas de 25 centavos? ");
        vinteCincox = leitor.nextFloat();
        System.out.print("Quantas moedas de 50 centavos? ");
        cinquentax = leitor.nextFloat();
        System.out.print("Quantas moedas de 1 real? ");
        realx = leitor.nextFloat();
        System.out.print("Algum valor em nota pra adicionar? ");
        nota = leitor.nextFloat();
        total = (cincox * cinco) + (dezx * dez) + (vinteCincox * vinteCinco) +
                (cinquentax * cinquenta) + (realx * real) + nota;
        
        System.out.println("----- RESULTADO -----");        
        System.out.printf("Você tem ao todo R$%.2f\n", total);
        
       float valor10 = 10;
        
        if (total < 10) {
           System.out.println("----- FALTA QUANTO -----");
           System.out.printf("Falta %.2f para completar R$10,00 reais\n",valor10 - total);
           
        }else {
            System.out.println("----- VOCÊ JÁ COMPLETOU! -----");
            System.out.println("Você já pode trocar as moedas por uma nota de R$10,00 reais\n");
        }
        
        
        
    }
    
}
