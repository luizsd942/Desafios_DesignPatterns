package com.sistemavendas.venda;

import com.sistemavendas.boleta.Boleta;
import com.sistemavendas.nfe.NFe;

public interface ModuloVendaAbstract {

	public Boleta criarBoleta();
	public NFe criarNFe();
}
