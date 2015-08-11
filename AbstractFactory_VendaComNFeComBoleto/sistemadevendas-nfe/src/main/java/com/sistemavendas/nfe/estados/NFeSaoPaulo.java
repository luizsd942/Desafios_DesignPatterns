package com.sistemavendas.nfe.estados;

import com.sistemavendas.nfe.NFe;
import com.sistemavendas.produto.Produto;

public class NFeSaoPaulo implements NFe{

	@Override
	public double emitir(Produto produto) {

		double imposto;
		System.out.println("-------------- Nota Fiscal Paulista ----------------");
		imposto = produto.calcularTotal(1.20);
		System.out.println("Valor do imposto calculado para São Paulo: "
		+ imposto);
		System.out.println("Fim da Nota fiscal Eletrônica.");
		System.out.println("----------------------------------------------------");
		return imposto;
		
	}
	
}
