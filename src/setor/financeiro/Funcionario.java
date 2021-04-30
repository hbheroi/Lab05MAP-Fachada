package setor.financeiro;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return String.format("Funcionário: %s - Salário: %.2f\n", getNome(), getSalario());
	}
}