package com.sistemavendas.boleta.tipobancos;

import com.sistemavendas.boleta.Boleta;
import com.sistemavendas.produto.Produto;

public class BoletaBBrasil implements Boleta{

	@Override
	public void gerar(Produto produto, double imposto) {
		System.out.println("----------- Boleto Banco do Brasil -----------");
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Valor do imposto: "+imposto);
		System.out.println("---------------------------------------");
	}

}
