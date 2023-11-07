package dio.cliente;

import dio.fabricaAbstrata.FabricaDeTenis;
import dio.hierarquiaDeProdutos.Tenis;

public class Aplicacao {
	private Tenis tenis;
	
	public Aplicacao(FabricaDeTenis fabricar) {
		tenis = fabricar.criaTenis();
	}
	
	public void criaTenis() {
		tenis.correr();
	}
}
