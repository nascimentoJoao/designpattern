package interfaces;

import model.Cartao;
import model.Produto;

public interface IFacade {

	public void iniciar_app();
	public Produto gerar_produto(Integer codigo);
	public void adicionar_item_carrinho(Produto prod);
	public void encerrar_aplicacao();
	public Boolean realizar_pagamento(Cartao cartao, String tipo);
	
}
