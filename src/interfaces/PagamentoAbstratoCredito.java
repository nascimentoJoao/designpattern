package interfaces;

import model.Cartao;

public interface PagamentoAbstratoCredito {

	Boolean valida_cartao(Cartao cartao);
	
}
