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
		
		String expected = "Folha de Pagamento do m�s de Fevereiro/2021\n" + 
				"Funcion�rio: Diana - Sal�rio: 1550,00\n" + 
				"Funcion�rio: Annie - Sal�rio: 2200,00\n" + 
				"Funcion�rio: Caitlyn - Sal�rio: 1100,00\n";

		assertEquals(expected, financeiro.consultarInfoFolha(0));
		
	}
	
	@Test
	public void testFinanceiroConsultarBalanco() {
	
		financeiro.novoBalancoDeContas("Mar�o");
		financeiro.addContaAoBalanco(0, "�gua", 59.50);
		financeiro.addContaAoBalanco(0, "Energia", 231.00);
		financeiro.addContaAoBalanco(0, "Internet", 119.90);
		financeiro.addContaAoBalanco(0, "Combust�vel", 550.00);
		
		String expected = "Contas do m�s de Mar�o\n" + 
				"Conta: �gua - Valor: 59,50\n" + 
				"Conta: Energia - Valor: 231,00\n" + 
				"Conta: Internet - Valor: 119,90\n" + 
				"Conta: Combust�vel - Valor: 550,00\n";


		assertEquals(expected, financeiro.consultarBalanco(0));
	}


}
