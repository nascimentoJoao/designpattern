package model;

public class Cartao {
	
	private String titular;
	
	private String numero;
	
	private String validade;

	private String codigo_verificador;
	
	private String bandeira;
	
	public Cartao(String numero) {
		super();
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getCodigo_verificador() {
		return codigo_verificador;
	}

	public void setCodigo_verificador(String codigo_verificador) {
		this.codigo_verificador = codigo_verificador;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
}
