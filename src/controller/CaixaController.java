package controller;

import observer.CaixaMercado;

public class CaixaController {
	
	private static CaixaMercado instance;
	
	public static CaixaMercado getInstance() {
		
		if(instance == null) {
			instance = new CaixaMercado();
		}
		
		return instance;
	}

}
