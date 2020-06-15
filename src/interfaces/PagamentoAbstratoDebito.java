package interfaces;

import model.Cartao;

public interface PagamentoAbstratoDebito {

	Boolean valida_cartao(Cartao cartao);
	
}
