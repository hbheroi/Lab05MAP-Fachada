package setor.academico;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nome;
	private List<Disciplina> disciplinas;
	private int tempoDeCasa;
	
	public Professor(String nome, int tempoDeCasa) {
		setNome(nome);
		setTempoDeCasa(tempoDeCasa);
		disciplinas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoDeCasa() {
		return tempoDeCasa;
	}

	public void setTempoDeCasa(int tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
	}

	public List<Disciplina> getAlocacao() {
		return disciplinas;
	}

	public void alocarNaDisciplina(int cod, String disc) {
		disciplinas.add(new Disciplina(cod, disc));
	}
	
	public String infoProfessor() {
		StringBuilder string = new StringBuilder(this.toString());
		string.append("Alocado nas disciplinas:\n");
		if(disciplinas.isEmpty()) {
			string.append("Não está alocado em nenhuma disciplina.\n");
		}else {
			for(Disciplina disc : disciplinas) {
				string.append(disc);
			}
		}
		return string.toString();
	}
	
	@Override
	public String toString() {
		return String.format("Professor: %s - Tempo de Casa: %d\n", getNome(), getTempoDeCasa());
	}
}