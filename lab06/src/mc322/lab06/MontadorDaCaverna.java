package mc322.lab06;

public class MontadorDaCaverna {
	private Caverna caverna;
	private Componente componente;
	private String[] vetorAuxiliar = new String[3];
	private String componenteType;
	private int Yc,Xc;  //Coordenada Y e coordenada X do componente
	
	//CONSTRUTOR:
	public MontadorDaCaverna() {
	
	}
	public void criaCaverna() {
		caverna= new Caverna();
		caverna.criaCaverna();
	}
	
	public void posicionaComponentes(String[][] posicaoComponentes){ //lê matriz das posições e componentes,cria componentes e verifica se pode posicionar(se puder posiciona)
		for(int linha=0; linha<16; linha++) {
				vetorAuxiliar = posicaoComponentes[linha][0].split("",0);
				Yc = Integer.parseInt(vetorAuxiliar[0])-1;
				Xc = Integer.parseInt(vetorAuxiliar[2])-1;
				componenteType = posicaoComponentes[linha][1];
				
				switch(componenteType) {
					
					case "P":
						componente = new Heroi(caverna);
						if((componente.posiciona(caverna, Yc, Xc))==false) {
							 // PRECISA DESLIGAR O PROGRAMA;
						}
					
					case "W":
						componente = new Wumpus(caverna);
						
					case "B":
						componente = new Buraco(caverna);
						
					case "O":
						componente = new Ouro(caverna);
						
					case "_": 
						
				
				}
				
		}
		
		
	}
	
}
