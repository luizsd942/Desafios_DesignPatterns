package com.luiz.emissaonota.PF;

import java.math.BigDecimal;

import com.algaworks.impressaonota.NotaFiscalInterface;
/*
 * Implementação da interface para calcular o imposto da nota de acordo com o seu tipo.
 */
public class ImplementsNotaPF implements NotaFiscalInterface  {

	private BigDecimal porcentagem = new BigDecimal("1.07");

	@Override
	public BigDecimal calcularImpostoNota(BigDecimal valorTotalNota) {

		return valorTotalNota.multiply(porcentagem);

	}
	

}
