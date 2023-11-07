package dio.fabricaConcreta;

import dio.fabricaAbstrata.FabricaDeTenis;
import dio.hierarquiaDeProdutos.Tenis;
import dio.hierarquiaDeProdutos.TenisEUA;

public class FabricaDeTenisEUA implements FabricaDeTenis{

	@Override
	public Tenis criaTenis() {
		return new TenisEUA();
	}
}
