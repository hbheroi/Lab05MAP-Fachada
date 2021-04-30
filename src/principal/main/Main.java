package principal.main;

import principal.sig.SIG;
import setor.administrativo.Evento.TipoEvento;

public class Main {
	
	public static void main(String[] args) throws Exception {
		SIG sig = new SIG();
		
		//MANIPULA��O DAS INFORMA��ES DOS ALUNOS 
		sig.matricularAluno("Fernanda", "Computa��o");
		sig.matricularAlunoNaDisciplina(0, 123, "MAP");
		sig.matricularAlunoNaDisciplina(0, 432, "Fisica");
		sig.adicionarAoHistoricoDoAluno(0, 567, "Algebra Linear");
		sig.adicionarAoHistoricoDoAluno(0, 789, "ATAL");
		System.out.println(sig.consultarAlunoRDM(0));
		System.out.println(sig.consultarAlunoHistorico(0));
		
		//MANIPULA��O DAS INFORMA��ES DOS PROFESSORES
		sig.matricularProfessor("Diana", 6);
		sig.cadastrarProfessorNaDisciplina(0, 735, "Algoritmos");
		sig.cadastrarProfessorNaDisciplina(0, 679, "Banco de Dados");
		System.out.println(sig.consultarInfoProfessor(0));
		
		//MANIPULA��O DAS INFORMA��ES ADMINISTRATIVAS
		sig.cadastrarEventosAdmin(TipoEvento.ENTREVISTA, "01-05-2021");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "26-04-2021");
		sig.cadastrarEventosAdmin(TipoEvento.REUNIAO, "27-04-2021");
		System.out.println(sig.listarEventosAdmin());
		
		//MANIPULA��O DAS INFORMA��ES DO ALMOXARIFADO
		sig.inserirNoEstoque("Sab�o OMO", 240);
		sig.inserirNoEstoque("Macarr�o Vitarela", 180);
		sig.inserirNoEstoque("Caf� S�o Braz", 60);
		System.out.println(sig.consultarEstoque());
		
		sig.realizarPedido("Creme Dental Colgate", 100);
		sig.realizarPedido("Arroz Chin�s", 24);
		sig.realizarPedido("Panetone Cacau Show", 60);
		System.out.println(sig.consultarListaPedidos());
		
		//MANIPULA��O DAS INFORMA��ES DO FINANCEIRO
		sig.novaFolhaDePagamento("Abril");
		sig.adicionarFuncionarioAFolha(0, "Luciano", 1200);
		sig.adicionarFuncionarioAFolha(0, "Morgana", 1500);
		sig.adicionarFuncionarioAFolha(0, "Evelyn", 998);
		System.out.println(sig.consultarFolhaDePagamento(0));
		
		sig.novoBalanco("Fevereiro");
		sig.adicionarContaBalanco(0, "�gua", 39.99);
		sig.adicionarContaBalanco(0, "Energia", 129.00);
		sig.adicionarContaBalanco(0, "Internet", 89.90);
		sig.adicionarContaBalanco(0, "Combust�vel", 450.00);
		System.out.println(sig.consultarBalanco(0));
		
		//MANIPULA��O DAS INFORMA��ES DE INFRA-ESTRUTURA
		sig.alocarSala("204", "B");
		sig.alocarSala("Lab. V", "CIAC");
		sig.alocarSala("Lab. III", "CIAC");
		System.out.println(sig.consultarSalasAlocadas());
	}
}