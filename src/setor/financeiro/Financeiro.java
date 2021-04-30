package setor.financeiro;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {
	
	private List<FolhaDePagamento> folhasDePagamento;
	private List<BalancoDeContas> balanco;
	
	public Financeiro() {
		folhasDePagamento = new ArrayList<>();
		balanco = new ArrayList<>();
	}
	
	public void novaFolhaDePagamento(String mes) {
		folhasDePagamento.add(new FolhaDePagamento(mes));
	}
	
	public void addFuncionarioAFolha(int folha, String nome, double salario) {
		folhasDePagamento.get(folha).addFuncionario(nome, salario);
	}
	
	public String consultarInfoFolha(int folha) {
		return folhasDePagamento.get(folha).consultarFolhaDePagamento();
	}

	public void novoBalancoDeContas(String mes) {
		balanco.add(new BalancoDeContas(mes));
	}
	
	public void addContaAoBalanco(int indice, String conta, double valor) {
		balanco.get(indice).adicionarConta(conta, valor);
	}
	
	public String consultarBalanco(int indice) {
		return balanco.get(indice).consultarBalanco();
	}
}