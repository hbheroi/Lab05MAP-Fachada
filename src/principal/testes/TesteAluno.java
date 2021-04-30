package principal.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import setor.academico.Aluno;

public class TesteAluno {
	
	
	
	@Test
	public void testAlunoRDMSIG() throws Exception {
		Aluno aluno = new Aluno("João", "Física");
		
		aluno.matricularDisciplina(123, "História do Brasil");
		aluno.matricularDisciplina(432, "História da Paraíba");
		aluno.adicionarAoHistorico(567, "Ética");
		aluno.adicionarAoHistorico(789, "Metodologia Científica");
		
		String expected = "Aluno: João - Curso: Física\n" + 
				"RDM - Disciplinas Matriculadas:\n" + 
				"Código: 123 - Disciplina: História do Brasil\n" + 
				"Código: 432 - Disciplina: História da Paraíba\n";
		
		assertEquals(expected, aluno.consultarRDM());
		
	}

}
