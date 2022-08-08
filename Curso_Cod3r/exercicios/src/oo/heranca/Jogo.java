package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
//		System.out.println(j1.x);
//		System.out.println(j1.y);
		
		Heroi heroi = new Heroi(10, 11);
	
		System.out.println("Monstro tem " + monstro.vida);
		System.out.println("Herói tem " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem " + monstro.vida);
		System.out.println("Herói tem " + heroi.vida);

		
	}

}
