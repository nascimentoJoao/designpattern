package interfaces;

import model.Cartao;

public interface PagamentoAbstratoPaypal {

	Boolean valida_cartao(Cartao cartao);
	
}
