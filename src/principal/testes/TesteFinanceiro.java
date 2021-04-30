package principal.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import setor.financeiro.Financeiro;

public class TesteFinanceiro {
	
	Financeiro financeiro = new Financeiro();
	
	@Test
	public void testFinanceiroConsultarFolhaDePagamento() {
		financeiro.novaFolhaDePagamento("Fevereiro/2021");
		financeiro.addFuncionarioAFolha(0, "Diana", 1550);
		financeiro.addFuncionarioAFolha(0, "Annie", 2200);
		financeiro.addFuncionarioAFolha(0, "Caitlyn", 1100);
		
		String expected = "Folha de Pagamento do mês de Fevereiro/2021\n" + 
				"Funcionário: Diana - Salário: 1550,00\n" + 
				"Funcionário: Annie - Salário: 2200,00\n" + 
				"Funcionário: Caitlyn - Salário: 1100,00\n";

		assertEquals(expected, financeiro.consultarInfoFolha(0));
		
	}
	
	@Test
	public void testFinanceiroConsultarBalanco() {
	
		financeiro.novoBalancoDeContas("Março");
		financeiro.addContaAoBalanco(0, "Água", 59.50);
		financeiro.addContaAoBalanco(0, "Energia", 231.00);
		financeiro.addContaAoBalanco(0, "Internet", 119.90);
		financeiro.addContaAoBalanco(0, "Combustível", 550.00);
		
		String expected = "Contas do mês de Março\n" + 
				"Conta: Água - Valor: 59,50\n" + 
				"Conta: Energia - Valor: 231,00\n" + 
				"Conta: Internet - Valor: 119,90\n" + 
				"Conta: Combustível - Valor: 550,00\n";


		assertEquals(expected, financeiro.consultarBalanco(0));
	}


}
