package principal.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import setor.academico.Aluno;

public class TesteAluno {
	
	
	
	@Test
	public void testAlunoRDMSIG() throws Exception {
		Aluno aluno = new Aluno("Jo�o", "F�sica");
		
		aluno.matricularDisciplina(123, "Hist�ria do Brasil");
		aluno.matricularDisciplina(432, "Hist�ria da Para�ba");
		aluno.adicionarAoHistorico(567, "�tica");
		aluno.adicionarAoHistorico(789, "Metodologia Cient�fica");
		
		String expected = "Aluno: Jo�o - Curso: F�sica\n" + 
				"RDM - Disciplinas Matriculadas:\n" + 
				"C�digo: 123 - Disciplina: Hist�ria do Brasil\n" + 
				"C�digo: 432 - Disciplina: Hist�ria da Para�ba\n";
		
		assertEquals(expected, aluno.consultarRDM());
		
	}

}
