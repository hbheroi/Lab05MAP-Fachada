package setor.almoxarifado;

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado {
	
	private List<Produto> estoque;
	private List<Produto> pedidos;
	
	public Almoxarifado() {
		estoque = new ArrayList<>();
		pedidos = new ArrayList<>();
	}
	
	public void inserirNoEstoque(String produto, int quantidade) {
		estoque.add(new Produto(produto, quantidade));
	}
	
	public List<Produto> getEstoque(){
		return estoque;
	}
	
	public void realizarPedido(String produto, int quantidade) {
		pedidos.add(new Produto(produto, quantidade));
	}
	
	public List<Produto> getPedidos(){
		return pedidos;
	}
	
	public String listarEstoque() {
		StringBuilder string = new StringBuilder("Estoque dos produtos:\n");
		if(estoque.isEmpty()) {
			string.append("Não há produtos no estoque.\n");
		}else {
			for(Produto prod : estoque) {
				string.append(prod);
			}
		}
		return string.toString();
	}
	
	public String listarPedidos() {
		StringBuilder string = new StringBuilder("Lista de Pedidos:\n");
		if(pedidos.isEmpty()) {
			string.append("Não há pedidos realizados.\n");
		}else {
			for(Produto prod : pedidos) {
				string.append(prod);
			}
		}		
		return string.toString();
	}
}