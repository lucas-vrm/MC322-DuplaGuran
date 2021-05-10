package mc322.lab06;

public class Heroi extends Componente {

	//CONTRUTOR:
	public Heroi(Caverna caverna) {
		super(caverna);
		type = "P";
	}
	
	public boolean posiciona(Caverna caverna, int Yc, int Xc) {
		return caverna.posiciona(Yc, Xc, this);
			
		
	}
}
