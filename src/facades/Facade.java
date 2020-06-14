package facades;

import java.util.Date;
import java.util.Scanner;

import controller.CaixaController;
import controller.CarrinhoController;
import interfaces.IFacade;
import interfaces.ProdutoDescontoObserver;
import model.Carrinho;
import model.Produto;
import observer.CaixaMercado;
import observer.ProdutoDescontoEvent;

public class Facade implements IFacade {
	
	private Carrinho instance_carrinho;
	
	private CaixaMercado instance_caixa;
	
	private Boolean  executar;
	
	public void addProdutoDescontoObserver(ProdutoDescontoObserver observer) {
		this.instance_caixa.getObservers().add(observer);
	}
	
	public Facade() {
		instance_carrinho = CarrinhoController.getInstance();
		instance_caixa = CaixaController.getInstance();
		executar = true;
	}
	
	
	@Override
	public void iniciar_app() {
		instance_caixa.addProdutoDescontoObserver(CarrinhoController.getInstance());
		
		instance_caixa.start();
		
		Scanner scanner = new Scanner(System.in);
		
		int cod = 0;
		
		while(executar) {
			cod = scanner.nextInt();
			if(cod == 9) { encerrar_aplicacao(); }
			else {
				Produto prod = gerar_produto(cod);
				adicionar_item_carrinho(prod);
			}
		}
		
		scanner.close();
	}

	@Override
	public void adicionar_item_carrinho(Produto prod) {
		System.out.println("Vendendo o produto [" + prod.getCodigo() + "] " + prod.getNome() + " - " + prod.getValor());
		instance_carrinho.adicionar_item(prod);
	}
	
	@Override
	public void encerrar_aplicacao() {
		System.out.println("Encerrando a aplicação...");
		System.out.println("Agradecemos a preferência!");
		executar = false;
	}
	
	@Override
	public Produto gerar_produto(Integer codigo) {
		
		Produto prod = null;
		
		if(codigo == 1) {
			prod = new Produto(1, "Leite", 2.99);
		}		
		
		if(codigo == 2) {
			prod = new Produto(2, "Arroz", 1.99);
		}
		
		if(codigo == 3) {
			prod = new Produto(3, "Biscoito", 3.99);
			ProdutoDescontoEvent event = new ProdutoDescontoEvent(new Date(), prod);
			
			for(ProdutoDescontoObserver observer: this.instance_caixa.getObservers()) {
				observer.descontar(event);
			}
		}
		
		return prod;
	}
	

}
