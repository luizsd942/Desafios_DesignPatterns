package com.sistemavendas.boleta;

import com.sistemavendas.produto.Produto;

public interface Boleta{

	public void gerar(Produto produto, double imposto);
}
