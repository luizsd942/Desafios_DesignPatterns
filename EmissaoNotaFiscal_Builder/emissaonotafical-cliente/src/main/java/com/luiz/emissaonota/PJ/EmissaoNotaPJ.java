package com.luiz.emissaonota.PJ;

import com.algaworks.impressaonota.NotaFiscalInterface;
import com.algaworks.nota.Nota;
/*
 * Classe responsável por criar o objeto do tipo Pessoa Jurídica (FactoryMethod),
 * Faz sobrecarga do método calculoImpostos() da classe pai (Abstract Nota).
 */
public class EmissaoNotaPJ extends Nota{

	@Override
	protected NotaFiscalInterface calculoImpostos() {
		return new ImplementsNotaPJ();
	}
	
	
}
