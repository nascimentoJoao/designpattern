package abstractfactory;

import interfaces.PagamentoAbstratoCredito;
import interfaces.PagamentoAbstratoDebito;
import interfaces.PagamentoAbstratoPaypal;

public interface AbstractFactoryPagamento {
	
	PagamentoAbstratoCredito pagamento_credito();
	PagamentoAbstratoDebito  pagamento_debito();
	PagamentoAbstratoPaypal  pagamento_paypal();

}
