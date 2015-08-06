package com.luiz.builder;

import com.algaworks.nota.Nota;
/*
 * Essa classe tem como objetivo forçar a inicialização do Numero da Nota,
 * assim o programador deve sempre informá-lo como item obrigatório, pois
 * senão não compila. 
 */
public class EmitirNotaBuilderValido {

	private Nota instancia;
	
	public EmitirNotaBuilderValido(Nota instancia) {
		this.instancia = instancia;
	}

	public Nota construir() {
		return this.instancia;
	}
}
