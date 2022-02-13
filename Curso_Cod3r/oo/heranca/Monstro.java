package oo.heranca;

public class Monstro extends Jogador {

	public Monstro(){
		this(0,0); // this chama o super debaixo
	}
	
	public Monstro(int x, int y){
		super(x,y);
	}
	
}
