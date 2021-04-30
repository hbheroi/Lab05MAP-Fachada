package principal.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import setor.almoxarifado.Almoxarifado;

public class TesteAlmoxarifado {
	
	Almoxarifado alm = new Almoxarifado();
	
	@Test
	public void testAlmoxarifadoListarEstoqueVazio() {
		String expected = "Estoque dos produtos:\n" +
				"Não há produtos no estoque.\n";
		
		assertEquals(expected, alm.listarEstoque());
	}
	
	@Test
	public void testAlmoxarifadoListarPedidosVazio() {
				
		String expected = "Lista de Pedidos:\n" + 
				"Não há pedidos realizados.\n";
		
		assertEquals(expected, alm.listarPedidos());
	}
	
	@Test
	public void testAlmoxarifadoListarEstoque() {
		alm.inserirNoEstoque("Desinfetante", 120);
		alm.inserirNoEstoque("Feijão", 30);
		alm.inserirNoEstoque("Leite em Pó", 8);
		
		String expected = "Estoque dos produtos:\n" + 
				"Produto: Desinfetante - Quantidade: 120\n" + 
				"Produto: Feijão - Quantidade: 30\n" + 
				"Produto: Leite em Pó - Quantidade: 8\n";

		assertEquals(expected, alm.listarEstoque());
		
	}

	@Test
	public void testAlmoxarifadoListarPedidos() {
				
		alm.realizarPedido("Shampoo Dove", 24);
		alm.realizarPedido("Cerveja Itaipava", 300);
		alm.realizarPedido("Chocotone", 30);
		
		String expected = "Lista de Pedidos:\n" + 
				"Produto: Shampoo Dove - Quantidade: 24\n" + 
				"Produto: Cerveja Itaipava - Quantidade: 300\n" + 
				"Produto: Chocotone - Quantidade: 30\n";
		
		assertEquals(expected, alm.listarPedidos());
	}

}
