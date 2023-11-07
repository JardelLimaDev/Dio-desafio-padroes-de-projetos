package dio.cliente.ConfiguraçãoAplicacao;

import java.util.Scanner;

import dio.cliente.Aplicacao;
import dio.fabricaAbstrata.FabricaDeTenis;
import dio.fabricaConcreta.FabricaDeTenisBR;
import dio.fabricaConcreta.FabricaDeTenisEUA;

public class Teste {
	private static Aplicacao teste() {
		Aplicacao app;
		FabricaDeTenis fabricar = null;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Escolha o melhor tênis");
		System.out.println("Digite [1] Para Tenis BR");
		System.out.println("Digite [2] Para Tenis EUA");
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			fabricar = new FabricaDeTenisBR();
		}else if(escolha == 2){
			fabricar = new FabricaDeTenisEUA();
		}
		app = new Aplicacao(fabricar);
		return app;
	}
	
	public static void main(String[] args) {
		Aplicacao app = teste();
		app.criaTenis();
	}
	
	
}
