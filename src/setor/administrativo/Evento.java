package setor.administrativo;

public class Evento {
	
	public enum TipoEvento {
		REUNIAO("Reunião"), ENTREVISTA("Entrevista");
		
		private String tipo;
		
		private TipoEvento(String tipo){
			this.tipo = tipo;
		}
		
		public String getTipo() {
			return this.tipo;
		}
	};
	
	private TipoEvento tipo;
	private String data;
	
	public Evento(TipoEvento tipo, String data) {
		setTipo(tipo);
		setData(data);
	}

	public String getTipo() {
		return tipo.getTipo();
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return String.format("Evento: %s - Data: %s\n", getTipo(), getData());
	}
}