package principal.sig;

import java.util.ArrayList;
import java.util.List;

import setor.academico.Aluno;
import setor.academico.Professor;
import setor.administrativo.Administrativo;
import setor.administrativo.Evento.TipoEvento;
import setor.almoxarifado.Almoxarifado;
import setor.financeiro.Financeiro;
import setor.infraEstrutura.Alocacao;

public class SIG {
	
	private List<Aluno> listaAlunos;
	private List<Professor> listaProfessores;
	private Administrativo adm;
	private Almoxarifado al;
	private Financeiro fin;
	private Alocacao aloc;
	
	public SIG() {
		listaAlunos = new ArrayList<>();
		listaProfessores = new ArrayList<>();
		adm = new Administrativo();
		al = new Almoxarifado();
		fin = new Financeiro();
		aloc = new Alocacao();
	}
	
	//MANIPULA플O DAS INFORMA합ES DOS ALUNOS
	public boolean matricularAluno(String nome, String curso) throws Exception {
		Aluno aluno = new Aluno(nome, curso);
		if(listaAlunos.contains(aluno)) {
			return false;
		} else {
			//listaAlunos.add(new Aluno(nome, curso));
			listaAlunos.add(aluno);
			return true;
		}
	}
	
	public void matricularAlunoNaDisciplina(int aluno, int cod, String disc) {
		listaAlunos.get(aluno).matricularDisciplina(cod, disc);
	}
	
	public void adicionarAoHistoricoDoAluno(int aluno, int cod, String disc) {
		listaAlunos.get(aluno).adicionarAoHistorico(cod, disc);
	}
	
	public String consultarAlunoRDM(int aluno) {
		return listaAlunos.get(aluno).consultarRDM();
	}
	
	public String consultarAlunoHistorico(int aluno) {
		return listaAlunos.get(aluno).consultarHistorico();
	}
	
	//MANIPULA플O DAS INFORMA합ES DOS PROFESSORES
	public boolean matricularProfessor(String nome, int tempoDeCasa) {
		Professor professor = new Professor(nome, tempoDeCasa);
		if(listaProfessores.contains(professor)) {
			return false;
		} else {
			listaProfessores.add(professor);
			return true;
		}
		//listaProfessores.add(new Professor(nome, tempoDeCasa));
	}
	
	public void cadastrarProfessorNaDisciplina(int prof, int cod, String disc) {
		listaProfessores.get(prof).alocarNaDisciplina(cod, disc);
	}
	
	public String consultarInfoProfessor(int prof) {
		return listaProfessores.get(prof).infoProfessor();
	}
	
	//MANIPULA플O DAS INFORMA합ES ADMINISTRATIVAS
	public void cadastrarEventosAdmin(TipoEvento tipo, String data) {
		
		adm.cadastrarEvento(tipo, data);
	}
	
	public String listarEventosAdmin() {
		return adm.listarEventos();
	}
	
	//MANIPULA플O DAS INFORMA합ES DO ALMOXARIFADO
	public void inserirNoEstoque(String produto, int quantidade) {
		al.inserirNoEstoque(produto, quantidade);
	}
	
	public void realizarPedido(String produto, int quantidade) {
		al.realizarPedido(produto, quantidade);
	}
	
	public String consultarEstoque() {
		return al.listarEstoque();
	}
	
	public String consultarListaPedidos() {
		return al.listarPedidos();
	}
	
	//MANIPULA플O DAS INFORMA합ES DO FINANCEIRO
	public void novaFolhaDePagamento(String mes) {
		fin.novaFolhaDePagamento(mes);
	}
	
	public void novoBalanco(String mes) {
		fin.novoBalancoDeContas(mes);
	}
	
	public void adicionarFuncionarioAFolha(int folha, String nome, double salario){
		fin.addFuncionarioAFolha(folha, nome, salario);
	}
	
	public void adicionarContaBalanco(int balanco, String conta, double valor) {
		fin.addContaAoBalanco(balanco, conta, valor);
	}
	
	public String consultarFolhaDePagamento(int mes) {
		return fin.consultarInfoFolha(mes);
	}
	
	public String consultarBalanco(int mes) {
		return fin.consultarBalanco(mes);
	}
	
	//MANIPULA플O DAS INFORMA합ES DE INFRA-ESTRUTURA
	public void alocarSala(String sala, String bloco) {
		aloc.alocarSala(sala, bloco);
	}
	
	public String consultarSalasAlocadas() {
		return aloc.listarSalasAlocadas();
	}
}