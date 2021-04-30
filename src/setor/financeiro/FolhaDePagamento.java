package setor.financeiro;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
	
	private String mes;
	private List<Funcionario> funcionarios;
	
	public FolhaDePagamento(String mes) {
		setMes(mes);
		funcionarios = new ArrayList<>();
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void addFuncionario(String nome, double salario) {
		funcionarios.add(new Funcionario(nome, salario));
	}
	
	public List<Funcionario> getListaFuncionarios(){
		return funcionarios;
	}
	
	public String consultarFolhaDePagamento() {
		StringBuilder string = new StringBuilder("Folha de Pagamento do mês de "+getMes()+"\n");
		if(funcionarios.isEmpty()) {
			string.append("Nenhum pagamento registrado.\n");
		}else {
			for(Funcionario func : funcionarios) {
				string.append(func);
			}	
		}
		return string.toString();
	}
}