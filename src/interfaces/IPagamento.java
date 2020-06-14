package interfaces;

import model.Cartao;

public interface IPagamento {

	public void validar_cartao(Cartao cartao);
	public void validar_vencimento(Cartao cartao);
	public void validar_bandeira(Cartao cartao);
	
}
