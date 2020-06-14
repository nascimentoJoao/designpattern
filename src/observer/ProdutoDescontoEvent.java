package observer;

import java.util.Date;

import model.Produto;

public class ProdutoDescontoEvent {
	
	private final Date data_desconto;
	private final Produto produto;
	
	public ProdutoDescontoEvent(Date data_desconto, Produto produto) {
		this.data_desconto = data_desconto;
		this.produto = produto;
	}

	public Date getData_desconto() {
		return data_desconto;
	}

	public Produto getProduto() {
		return produto;
	}

}
