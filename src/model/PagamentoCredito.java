package model;

import interfaces.PagamentoAbstratoCredito;

public class PagamentoCredito implements PagamentoAbstratoCredito {

	@Override
	public Boolean valida_cartao(Cartao cartao) {
		return cartao.getNumero().startsWith("4");
	}

}
