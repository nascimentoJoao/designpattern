package observer;

import java.util.ArrayList;
import java.util.List;
import interfaces.ProdutoDescontoObserver;


public class CaixaMercado extends Thread {
	
	private List<ProdutoDescontoObserver> observers = new ArrayList<>();
		
	public void addProdutoDescontoObserver(ProdutoDescontoObserver observer) {
		this.observers.add(observer);
	}
		
	public List<ProdutoDescontoObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<ProdutoDescontoObserver> observers) {
		this.observers = observers;
	}

	@Override
	public void run() {
		//Facade facade = new Facade();
		//facade.iniciar_app();
	}
	
}
