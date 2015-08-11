package com.sistemavendas.nfe.estados;

import com.sistemavendas.nfe.NFe;
import com.sistemavendas.produto.Produto;

public class NFeRioDeJaneiro implements NFe{

	@Override
	public double emitir(Produto produto) {
		double imposto;
		System.out.println("Nota Fiscal Carioca");
		imposto = produto.calcularTotal(1.18);
		System.out.println("Valor do imposto calculado para Rio de Janeiro: "
		+ imposto);
		return imposto;
	}
	
}
