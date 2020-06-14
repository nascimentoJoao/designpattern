package interfaces;

import observer.ProdutoDescontoEvent;

public interface ProdutoDescontoObserver {
	
	public void descontar(ProdutoDescontoEvent event);

}
