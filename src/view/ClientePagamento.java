package view;

import abstractfactory.AbstractFactoryPagamento;
import interfaces.PagamentoAbstratoCredito;
import interfaces.PagamentoAbstratoDebito;
import interfaces.PagamentoAbstratoPaypal;
import model.Cartao;

public class ClientePagamento {
	
	private PagamentoAbstratoCredito credito;
	private PagamentoAbstratoDebito  debito;
	private PagamentoAbstratoPaypal  paypal;
	
	public ClientePagamento(AbstractFactoryPagamento absfac) {
		this.credito = absfac.pagamento_credito();
		this.debito = absfac.pagamento_debito();
		this.paypal = absfac.pagamento_paypal();
	}
	
	public Boolean pagar(Cartao cartao, String tipo) {
		if(tipo.equalsIgnoreCase("debito")) {
			return this.debito.valida_cartao(cartao);
		}
		
		if(tipo.equalsIgnoreCase("credito")) {
			return this.credito.valida_cartao(cartao);
		}
		
		return this.paypal.valida_cartao(cartao);
	}

}
