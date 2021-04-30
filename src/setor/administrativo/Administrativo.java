package setor.administrativo;

import java.util.ArrayList;
import java.util.List;

import setor.administrativo.Evento.TipoEvento;

public class Administrativo {
	
	private List<Evento> eventos;
	
	public Administrativo() {
		eventos = new ArrayList<>();
	}
	
	public void cadastrarEvento(TipoEvento tipo, String data) {
		eventos.add(new Evento(tipo, data));
	}
	
	public List<Evento> getEventos(){
		return eventos;
	}
	
	public String listarEventos() {
		StringBuilder string = new StringBuilder("Eventos da Diretoria: \n");
		if(eventos.isEmpty()) {
			string.append("Nenhum evento registrado.\n");
		}else {
			for(Evento e : eventos) {
				string.append(e);
			}
		}
		return string.toString();
	}
}