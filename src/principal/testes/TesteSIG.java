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
		sig.matricularAluno("", "computação");
		
	}
				

	@Test
	public void testAlunoRDMSIG() throws Exception {
		sig.matricularAluno("João", "História");
		sig.matricularAlunoNaDisciplina(0, 123, "História do Brasil");
		sig.matricularAlunoNaDisciplina(0, 432, "História da Paraíba");
		sig.adicionarAoHistoricoDoAluno(0, 567, "Ética");
		sig.adicionarAoHistoricoDoAluno(0, 789, "Metodologia Científica");
		
		String expected = "Aluno: João - Curso: História\n" + 
				"RDM - Disciplinas Matriculadas:\n" + 
				"Código: 123 - Disciplina: História do Brasil\n" + 
				"Código: 432 - Disciplina: História da Paraíba\n";
		
		assertEquals(expected, sig.consultarAlunoRDM(0));
		
	}
	
	@Test
	public void testAlunoHistoricoSIG() throws Exception {
		
		sig.matricularAluno("Sebastião", "História");
		sig.adicionarAoHistoricoDoAluno(0, 567, "Ética");
		sig.adicionarAoHistoricoDoAluno(0, 789, "Metodologia Científica");
		
		String expected = "Aluno: Sebastião - Curso: História\n" + 
				"Histórico de Disciplinas:\n" + 
				"Código: 567 - Disciplina: Ética\n" + 
				"Código: 789 - Disciplina: Metodologia Científica\n";
		
		assertEquals(expected, sig.consultarAlunoHistorico(0));
	}
	
	@Test
	public void testProfessorSIG() {
		sig.matricularProfessor("Fernanda", 3);
		sig.cadastrarProfessorNaDisciplina(0, 735, "Matemática Básica");
		sig.cadastrarProfessorNaDisciplina(0, 679, "Física");
		
		String expected = "Professor: Fernanda - Tempo de Casa: 3\n" + 
				"Alocado nas disciplinas:\n" + 
				"Código: 735 - Disciplina: Matemática Básica\n" + 
				"Código: 679 - Disciplina: Física\n";
		
		assertEquals(expected, sig.consultarInfoProfessor(0));
	}
	
	@Test
	public void testAdminSIG() {
		sig.cadastrarEventosAdmin(TipoEvento.ENTREVISTA, "30-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "12-12-2019");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "15-12-2019");
		
		String expected = "Eventos da Diretoria: \n" + 
				"Evento: Entrevista - Data: 30-12-2019\n" + 
				"Evento: Reunião - Data: 12-12-2019\n" + 
				"Evento: Reunião - Data: 15-12-2019\n";
		
		assertEquals(expected, sig.listarEventosAdmin());
	}
	
	@Test
	public void testAlmoxarifadoConsultarEstoqueSIG() {
		sig.inserirNoEstoque("Desinfetante", 120);
		sig.inserirNoEstoque("Feijão", 30);
		sig.inserirNoEstoque("Leite em Pó", 8);
		
		String expected = "Estoque dos produtos:\n" + 
				"Produto: Desinfetante - Quantidade: 120\n" + 
				"Produto: Feijão - Quantidade: 30\n" + 
				"Produto: Leite em Pó - Quantidade: 8\n";

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
		
		String expected = "Folha de Pagamento do mês de Fevereiro/2021\n" + 
				"Funcionário: Diana - Salário: 1550,00\n" + 
				"Funcionário: Annie - Salário: 2200,00\n" + 
				"Funcionário: Caitlyn - Salário: 1100,00\n";

		assertEquals(expected, sig.consultarFolhaDePagamento(0));
		
	}
	
	@Test
	public void testFinanceiroConsultarBalancoSIG() {
	
		sig.novoBalanco("Março");
		sig.adicionarContaBalanco(0, "Água", 59.50);
		sig.adicionarContaBalanco(0, "Energia", 231.00);
		sig.adicionarContaBalanco(0, "Internet", 119.90);
		sig.adicionarContaBalanco(0, "Combustível", 550.00);
		
		String expected = "Contas do mês de Março\n" + 
				"Conta: Água - Valor: 59,50\n" + 
				"Conta: Energia - Valor: 231,00\n" + 
				"Conta: Internet - Valor: 119,90\n" + 
				"Conta: Combustível - Valor: 550,00\n";


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
		
		assertEquals(true,sig.matricularAluno("Hércules", "Computação"));
	}
	
	@Test(expected=Exception.class)
	public void testMatricularAlunoSemCursoSIG() throws Exception {
		
		sig.matricularAluno("Hércules", "");
	}

}
