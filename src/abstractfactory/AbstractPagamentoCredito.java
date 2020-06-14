package abstractfactory;

import interfaces.IPagamento;
import model.Cartao;

public abstract class AbstractPagamentoCredito implements IPagamento {

	@Override
	public void validar_cartao(Cartao cartao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validar_vencimento(Cartao cartao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validar_bandeira(Cartao cartao) {
		// TODO Auto-generated method stub
		
	}



}
