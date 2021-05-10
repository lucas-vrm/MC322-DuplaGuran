package mc322.lab06;

import java.util.ArrayList;

public class Sala {
	private ArrayList<Componente> componentesNaSala = new ArrayList();
	
	//CONSTRUTOR:
	public Sala() {
		
	}
	
	
	public String oquePrintar() {
		String[] vet = oqueTemNaSala();
		String print = "-";
			for(int i=0; i<vet.length;i++) {
				if(vet[i].equals("W") || vet[i].equals("B") || vet[i].equals("O")) {
					print = vet[i];
					return print;
				}
				else if( vet[i].equals("P") && (print.equals("-") || print.equals("f") || print.equals("b")) ) {
					print = vet[i];
				}
				else if(vet[i].equals("f") && (print.equals("-") || print.equals("b") )){
					print = vet[i];
				}
				else if(vet[i].equals("b") && print.equals("-") ) {
					print = vet[i];
				}
			}
			
		return print;
	}
	
	public String[] oqueTemNaSala() { //retorna vertor de strings do que tem na sala;
		String[] vet;
		if(componentesNaSala.isEmpty()==false) {
			vet = new String[componentesNaSala.size()];
			for(int i=0; i < componentesNaSala.size(); i++) {
				vet[i] = componentesNaSala.get(i).getType();
			}
			return vet;
		}
		vet = new String[1];
		vet[0] = "";
		
		return vet;
		
		
	}
	
	
	public boolean podePosicionar(Componente componente) { // verifica se pode posicionar na hora de montar a caverna, se sim retorna true e posiciona
		
		switch(componente.getType()) {
		
			case "P":
				for(int i=0; i<componentesNaSala.size();i++) {
					if(componentesNaSala.get(i).getType().equals("B") || componentesNaSala.get(i).getType().equals("W") || componentesNaSala.get(i).getType().equals("O")) {
						return false;
					}
				}
				componentesNaSala.add(componente);
				return true;
		
			case "W":
			
			case "B":
			
			case "O":
			
			case "_":
		}
		return false;
	}
}
