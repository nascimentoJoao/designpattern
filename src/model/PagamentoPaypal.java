package model;

import interfaces.PagamentoAbstratoPaypal;

public class PagamentoPaypal implements PagamentoAbstratoPaypal {

	@Override
	public Boolean valida_cartao(Cartao cartao) {

		return cartao.getNumero().startsWith("6");
		
	}

}
