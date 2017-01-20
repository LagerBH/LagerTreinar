package Atividades;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

import br.com.treinar.modelo.Equal;

public class Carro {
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	private String modelo;
	private String tipo;
	private String placa;

	public static void main(String[][] args) {

		Carro c1 = new Carro();

		Carro c2 = new Carro();
		c1.modelo = "siena";
		c2.modelo = "focus";
		c1.placa = "hkj-5643";
		c2.placa = "hkj-5643";
		c1.tipo = "hatch";
		c2.tipo = "suv";
	}

	public boolean equals(Object obj){ 
		
			c1.placa equals c2.placa;
		return 
		}

}}



/*
public boolean equals(Object obj) {
	Produto outro = (Produto) obj;
	return this.sku.equals(outro.getSku());
}*/

/*public class CadastradorProdutos {

	public static void main(String[] args) {
		Collection produtos = new ArrayList<>();
		
		System.out.println("##### Cadastro de produtos #####\n");
		
		try (Scanner entrada = new Scanner(System.in)) {
			String continuar = "s";
			while ("s".equalsIgnoreCase(continuar)) {
				System.out.print("SKU: ");
				String sku = entrada.nextLine();

				System.out.print("Nome: ");
				String nome = entrada.nextLine();
				
				Produto produto = new Produto(sku, nome);
				if (produtos.contains(produto))	{
					System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
				} else {
					produtos.add(produto);
					System.out.println("Produto adicionado.");
				}
				
				System.out.print("Deseja adicionar mais algum produto? (s/n) ");
				
				continuar = entrada.nextLine();
			}
		}
		
		produtos.forEach(System.out::println);

		System.out.println("Fim");
	}

}*/


