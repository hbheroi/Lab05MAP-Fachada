package principal.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import setor.administrativo.Administrativo;
import setor.administrativo.Evento.TipoEvento;

public class TesteAdministrativo {

	Administrativo adm = new Administrativo();
	
	@Test
	public void testListarEventosVazio() {
		
		String expected = "Eventos da Diretoria: \n" + 
				"Nenhum evento registrado.\n";
		assertEquals(expected ,adm.listarEventos());
	}
	
	@Test
	public void testCadastrarEvento() {

		adm.cadastrarEvento(TipoEvento.ENTREVISTA, "30-12-2019");
		String expected= "Eventos da Diretoria: \n" + 
				"Evento: Entrevista - Data: 30-12-2019\n";
		assertEquals(expected, adm.listarEventos());
	}
	
	@Test
	public void testListarEventos() {
		adm.cadastrarEvento(TipoEvento.ENTREVISTA, "30-12-2019");
		adm.cadastrarEvento(TipoEvento.REUNIAO, "12-12-2019");
		adm.cadastrarEvento(TipoEvento.REUNIAO, "15-12-2019");
		
		String expected = "Eventos da Diretoria: \n" + 
				"Evento: Entrevista - Data: 30-12-2019\n" + 
				"Evento: Reunião - Data: 12-12-2019\n" + 
				"Evento: Reunião - Data: 15-12-2019\n";
		
		assertEquals(expected, adm.listarEventos());
	}
	
	
}
