package operadores;


public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
//		int formula01 = (int) Math.pow(6 * (3+2) , 2);
//		int divisaoFormula01 = 3*2;
//		formula01 = formula01 / divisaoFormula01;
//		
//		int formula02 = (int) Math.pow((int) Math.pow((1-5) * (2-7) / 2 , 2), 3);
//		
//		
//		System.out.println(formula01);
//		System.out.println(formula02);
//		
//		int resultado01 = (int) Math.pow(formula01 - formula02, 3);
//		int divisaoResultado01 = (int) Math.pow(10, 3);
//		
//		System.out.println(resultado01 / divisaoResultado01);
		
		double numA = Math.pow(6 *(3+2),2);
		double denA = 3*2;
		
		double numB = (1-5) * (2-7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
	}

}
