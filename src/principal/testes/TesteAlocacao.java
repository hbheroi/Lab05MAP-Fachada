package principal.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import setor.infraEstrutura.Alocacao;

public class TesteAlocacao {
	
	Alocacao alc = new Alocacao();
	
	
	@Test
	public void ListarAlocacaoVazio() {
		
		String expected = "Salas Alocadas:\n" + 
				"Nenhuma sala alocada.\n";
		
		assertEquals(expected, alc.listarSalasAlocadas());
	}
	
	@Test
	public void testAlocacao() {
		alc.alocarSala("204", "B");
		alc.alocarSala("Lab. IV", "CIAC");
		alc.alocarSala("Lab. III", "CIAC");
		
		String expected = "Salas Alocadas:\n" + 
				"Sala: 204 - Bloco: B\n" + 
				"Sala: Lab. IV - Bloco: CIAC\n" + 
				"Sala: Lab. III - Bloco: CIAC\n";
		
		assertEquals(expected, alc.listarSalasAlocadas());
	}
	


}
