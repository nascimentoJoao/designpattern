package concretefactory;

import abstractfactory.AbstractFactoryPagamento;
import interfaces.PagamentoAbstratoCredito;
import interfaces.PagamentoAbstratoDebito;
import interfaces.PagamentoAbstratoPaypal;
import model.PagamentoCredito;
import model.PagamentoDebito;
import model.PagamentoPaypal;

public class ConcreteFactoryPagamento implements AbstractFactoryPagamento {

	@Override
	public PagamentoAbstratoCredito pagamento_credito() {
		return new PagamentoCredito();
	}

	@Override
	public PagamentoAbstratoDebito pagamento_debito() {
		return new PagamentoDebito();
	}

	@Override
	public PagamentoAbstratoPaypal pagamento_paypal() {
		return new PagamentoPaypal();
	}

}
