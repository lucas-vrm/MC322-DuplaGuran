package mc322.lab06;

public class ControleDoJogo {
	private MontadorDaCaverna montador;
	private String[][] posicaoComponentes;
	
	
	public ControleDoJogo() {
		montador = new MontadorDaCaverna(); 
	}
	
	public void executaJogo(String path) {
		montador.criaCaverna();
		CSVHandling csv = new CSVHandling();
		csv.setDataSource(path);
		posicaoComponentes = csv.requestCommands();
		
		
		
	}
}
