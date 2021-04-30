package setor.infraEstrutura;

public class Sala {
	
	private String sala;
	private String bloco;
	
	public Sala(String sala, String bloco) {
		setSala(sala);
		setBloco(bloco);
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	
	@Override
	public String toString() {
		return String.format("Sala: %s - Bloco: %s\n", getSala(), getBloco());
	}
}