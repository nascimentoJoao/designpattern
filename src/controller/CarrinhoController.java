package controller;

import model.Carrinho;

public class CarrinhoController {
	
	private static Carrinho instance;
		
	public static Carrinho getInstance() {
		if(instance == null) {
			instance = new Carrinho();
		}
		
		return instance;
	}

}
