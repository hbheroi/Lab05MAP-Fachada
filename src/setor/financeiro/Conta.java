package setor.financeiro;

public class Conta {
	
	private String conta;
	private double valor;
	
	public Conta(String conta, double valor) {
		setConta(conta);
		setValor(valor);
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return String.format("Conta: %s - Valor: %.2f\n", getConta(), getValor());
	}
}