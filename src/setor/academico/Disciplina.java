package setor.academico;

public class Disciplina {
	
	private int codigo;
	private String nome;
	
	public Disciplina(int cod, String nome) {
		setCodigo(cod);
		setNome(nome);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("Código: %d - Disciplina: %s\n", getCodigo(), getNome());
	}
}