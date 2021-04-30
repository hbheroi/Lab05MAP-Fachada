package setor.infraEstrutura;

import java.util.ArrayList;
import java.util.List;

public class Alocacao {
	
	private List<Sala> salas;
	
	public Alocacao() {
		salas = new ArrayList<>();
	}

	public void alocarSala(String sala, String bloco) {
		salas.add(new Sala(sala, bloco));
	}
	
	public List<Sala> getSalas(){
		return salas;
	}
	
	public String listarSalasAlocadas() {
		StringBuilder string = new StringBuilder("Salas Alocadas:\n");
		if(salas.isEmpty()) {
			string.append("Nenhuma sala alocada.\n");
		}else {
			for(Sala sala : salas) {
				string.append(sala);
			}
		}
		return string.toString();
	}
}