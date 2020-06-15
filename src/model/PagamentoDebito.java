package model;

import interfaces.PagamentoAbstratoDebito;

public class PagamentoDebito implements PagamentoAbstratoDebito {
	
	@Override
	public Boolean valida_cartao(Cartao cartao) {
		
		return cartao.getNumero().startsWith("5");
		
	}

}
