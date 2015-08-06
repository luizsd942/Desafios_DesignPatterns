package com.luiz.emissaonota.PJ;

import java.math.BigDecimal;

import com.algaworks.impressaonota.NotaFiscalInterface;
/*
 * Implementação da interface para calcular o imposto da nota de acordo com o seu tipo.
 */
public class ImplementsNotaPJ implements NotaFiscalInterface {

	private BigDecimal porcentagem = new BigDecimal("1.04");

	@Override
	public BigDecimal calcularImpostoNota(BigDecimal valorTotalNota) {

		return valorTotalNota.multiply(porcentagem);

	}

}
