package principal.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import principal.sig.SIG;
import setor.academico.Aluno;
import setor.administrativo.Evento.TipoEvento;

public class TesteSIG {

	SIG sig = new SIG();

	@Test(expected = IllegalArgumentException.class)
	public void testMatricularAlunoSemNomeSIG() throws Exception {
		sig.matricularAluno("", "computa��o");
		
	}
				

	@Test
	public void testAlunoRDMSIG() throws Exception {
		sig.matricularAluno("Jo�o", "Hist�ria");
		sig.matricularAlunoNaDisciplina(0, 123, "Hist�ria do Brasil");
		sig.matricularAlunoNaDisciplina(0, 432, "Hist�ria da Para�ba");
		sig.adicionarAoHistoricoDoAluno(0, 567, "�tica");
		sig.adicionarAoHistoricoDoAluno(0, 789, "Metodologia Cient�fica");
		
		String expected = "Aluno: Jo�o - Curso: Hist�ria\n" + 
				"RDM - Disciplinas Matriculadas:\n" + 
				"C�digo: 123 - Disciplina: Hist�ria do Brasil\n" + 
				"C�digo: 432 - Disciplina: Hist�ria da Para�ba\n";
		
		assertEquals(expected, sig.consultarAlunoRDM(0));
		
	}
	
	@Test
	public void testAlunoHistoricoSIG() throws Exception {
		
		sig.matricularAluno("Sebasti�o", "Hist�ria");
		sig.adicionarAoHistoricoDoAluno(0, 567, "�tica");
		sig.adicionarAoHistoricoDoAluno(0, 789, "Metodologia Cient�fica");
		
		String expected = "Aluno: Sebasti�o - Curso: Hist�ria\n" + 
				"Hist�rico de Disciplinas:\n" + 
				"C�digo: 567 - Disciplina: �tica\n" + 
				"C�digo: 789 - Disciplina: Metodologia Cient�fica\n";
		
		assertEquals(expected, sig.consultarAlunoHistorico(0));
	}
	
	@Test
	public void testProfessorSIG() {
		sig.matricularProfessor("Fernanda", 3);
		sig.cadastrarProfessorNaDisciplina(0, 735, "Matem�tica B�sica");
		sig.cadastrarProfessorNaDisciplina(0, 679, "F�sica");
		
		String expected = "Professor: Fernanda - Tempo de Casa: 3\n" + 
				"Alocado nas disciplinas:\n" + 
				"C�digo: 735 - Disciplina: Matem�tica B�sica\n" + 
				"C�digo: 679 - Disciplina: F�sica\n";
		
		assertEquals(expected, sig.consultarInfoProfessor(0));
	}
	
	@Test
	public void testAdminSIG() {
		sig.cadastrarEventosAdmin(TipoEvento.ENTREVISTA, "30-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "12-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "15-12-2019");
		
		String expected = "Eventos da Diretoria: \n" + 
				"Evento: Entrevista - Data: 30-12-2019\n" + 
				"Evento: Reuni�o - Data: 12-12-2019\n" + 
				"Evento: Reuni�o - Data: 15-12-2019\n";
		
		assertEquals(expected, sig.listarEventosAdmin());
	}
	
	@Test
	public void testAlmoxarifadoConsultarEstoqueSIG() {
		sig.inserirNoEstoque("Desinfetante", 120);
		sig.inserirNoEstoque("Feij�o", 30);
		sig.inserirNoEstoque("Leite em P�", 8);
		
		String expected = "Estoque dos produtos:\n" + 
				"Produto: Desinfetante - Quantidade: 120\n" + 
				"Produto: Feij�o - Quantidade: 30\n" + 
				"Produto: Leite em P� - Quantidade: 8\n";

		assertEquals(expected, sig.consultarEstoque());
		
	}

	@Test
	public void testAlmoxarifadoConsultarListaPedidosSIG() {
				
		sig.realizarPedido("Shampoo Dove", 24);
		sig.realizarPedido("Cerveja Itaipava", 300);
		sig.realizarPedido("Chocotone", 30);
		
		String expected = "Lista de Pedidos:\n" + 
				"Produto: Shampoo Dove - Quantidade: 24\n" + 
				"Produto: Cerveja Itaipava - Quantidade: 300\n" + 
				"Produto: Chocotone - Quantidade: 30\n";
		
		assertEquals(expected, sig.consultarListaPedidos());
	}
	
	@Test
	public void testFinanceiroConsultarFolhaDePagamentoSIG() {
		sig.novaFolhaDePagamento("Fevereiro/2021");
		sig.adicionarFuncionarioAFolha(0, "Diana", 1550);
		sig.adicionarFuncionarioAFolha(0, "Annie", 2200);
		sig.adicionarFuncionarioAFolha(0, "Caitlyn", 1100);
		
		String expected = "Folha de Pagamento do m�s de Fevereiro/2021\n" + 
				"Funcion�rio: Diana - Sal�rio: 1550,00\n" + 
				"Funcion�rio: Annie - Sal�rio: 2200,00\n" + 
				"Funcion�rio: Caitlyn - Sal�rio: 1100,00\n";

		assertEquals(expected, sig.consultarFolhaDePagamento(0));
		
	}
	
	@Test
	public void testFinanceiroConsultarBalancoSIG() {
	
		sig.novoBalanco("Mar�o");
		sig.adicionarContaBalanco(0, "�gua", 59.50);
		sig.adicionarContaBalanco(0, "Energia", 231.00);
		sig.adicionarContaBalanco(0, "Internet", 119.90);
		sig.adicionarContaBalanco(0, "Combust�vel", 550.00);
		
		String expected = "Contas do m�s de Mar�o\n" + 
				"Conta: �gua - Valor: 59,50\n" + 
				"Conta: Energia - Valor: 231,00\n" + 
				"Conta: Internet - Valor: 119,90\n" + 
				"Conta: Combust�vel - Valor: 550,00\n";


		assertEquals(expected, sig.consultarBalanco(0));
	}

	@Test
	public void testAlocacaoSIG() {
		sig.alocarSala("204", "B");
		sig.alocarSala("Lab. IV", "CIAC");
		sig.alocarSala("Lab. III", "CIAC");
		
		String expected = "Salas Alocadas:\n" + 
				"Sala: 204 - Bloco: B\n" + 
				"Sala: Lab. IV - Bloco: CIAC\n" + 
				"Sala: Lab. III - Bloco: CIAC\n";
		
		assertEquals(expected, sig.consultarSalasAlocadas());
	}
	@Test
	public void testMatricularAlunoSIG() throws Exception {
		
		assertEquals(true,sig.matricularAluno("H�rcules", "Computa��o"));
	}
	
	@Test(expected=Exception.class)
	public void testMatricularAlunoSemCursoSIG() throws Exception {
		
		sig.matricularAluno("H�rcules", "");
	}

}
