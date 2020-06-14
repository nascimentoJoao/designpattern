package model;

import java.util.ArrayList;

import interfaces.ProdutoDescontoObserver;
import observer.ProdutoDescontoEvent;

public class Carrinho implements ProdutoDescontoObserver{
	
	private ArrayList<Produto> produtos;
	
	public Carrinho() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionar_item(Produto prod) {
		this.produtos.add(prod);
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void descontar(ProdutoDescontoEvent event) {
		System.out.println("Aplicando desconto  no produto: " + event.getProduto().getNome());
		event.getProduto().setValor(event.getProduto().getValor() - 2);
	}

}
