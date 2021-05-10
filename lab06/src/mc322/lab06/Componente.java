package mc322.lab06;

public class Componente {
		protected String type;
		protected Caverna caverna;
		
		//CONTRUTOR:
		public Componente(Caverna caverna) {
			this.caverna = caverna;
			
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		public boolean posiciona(Caverna caverna, int Yc, int Xc) {
			return false;
		}
}
