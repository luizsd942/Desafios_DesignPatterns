package com.sistemavendas.venda;

import com.sistemavendas.boleta.Boleta;
import com.sistemavendas.nfe.NFe;
import com.sistemavendas.produto.Produto;

public class Venda {

	private Boleta boleta;
	private NFe nfe;

	public Venda(ModuloVendaAbstract vendaAbstract) {
		this.boleta = vendaAbstract.criarBoleta();
		this.nfe = vendaAbstract.criarNFe();
	}
	
	public double realizar(Produto produto) {
		double imposto = nfe.emitir(produto);
		boleta.gerar(produto, imposto);
		return imposto;
	}
	
}
