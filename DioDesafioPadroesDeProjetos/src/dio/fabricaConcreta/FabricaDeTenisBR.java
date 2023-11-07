package dio.fabricaConcreta;

import dio.fabricaAbstrata.FabricaDeTenis;
import dio.hierarquiaDeProdutos.Tenis;
import dio.hierarquiaDeProdutos.TenisBR;

public class FabricaDeTenisBR implements FabricaDeTenis {

	@Override
	public Tenis criaTenis() {
		return new TenisBR();
	}

}
