package setor.almoxarifado;

public class Produto {
	
	private String descricao;
	private int quantidade;
	
	public Produto(String descricao, int quantidade) {
		setDescricao(descricao);
		setQuantidade(quantidade);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("Produto: %s - Quantidade: %d\n", getDescricao(), getQuantidade());
	}
}