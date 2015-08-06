package com.luiz.teste;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.algaworks.nota.Nota;
import com.luiz.builder.EmitirNotaBuilder;

/*
 * Classe com testes Junit para testar as duas instâncias de tipos de nota fiscal
 * que são PessoaFisica e PessoaJuridica, utilizando o método Builder do Design Patterns.
 */
public class TestEmitirNotaFiscalBuilder {

	@Test
	public void testComBuilderPessoaFisica() {
		//Setando os valores...
		Nota notaFiscal = new EmitirNotaBuilder()
						.comPessoaFisica()
						.comData("04/08/2015")
						.comItem("Mochila", "2", "150")
						.comItem("Caderno", "3", "10")
						.comItem("Livro", "1", "70")
						.comNumero("123")
						.construir();
		
		//Resgata o valor total
		BigDecimal valorTotal = notaFiscal.calculoNF();
		assertEquals(new BigDecimal("428.0").doubleValue(), valorTotal.doubleValue(), 0.0001);
		
		//fail("Valor total incompatível com o esperado: "+valorTotal.doubleValue());
	}
	
	@Test
	public void testComBuilderPessoaJuridica() {
		//Setando os valores...
		Nota notaFiscal = new EmitirNotaBuilder()
						.comPessoaJuridica()
						.comData("04/08/2015")
						.comItem("Mochila", "2", "150")
						.comItem("Caderno", "3", "10")
						.comItem("Livro", "1", "70")
						.comNumero("456")
						.construir();
		
		//Resgata o valor total
		BigDecimal valorTotal = notaFiscal.calculoNF();
		//valor esperado 400 * 1.04 = 416
		assertEquals(new BigDecimal("416.0").doubleValue(), valorTotal.doubleValue(), 0.0001);
		
		//fail("Valor total incompatível com o esperado: "+valorTotal.doubleValue());
	}

}
