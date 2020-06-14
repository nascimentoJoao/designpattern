package interfaces;

import model.Produto;

public interface IFacade {

	public void iniciar_app();
	public Produto gerar_produto(Integer codigo);
	public void adicionar_item_carrinho(Produto prod);
	public void encerrar_aplicacao();
	
}
