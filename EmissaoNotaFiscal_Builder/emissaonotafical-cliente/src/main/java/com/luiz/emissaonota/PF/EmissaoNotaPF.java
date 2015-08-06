package com.luiz.emissaonota.PF;
/*
 * Criado por Luiz;
 */

import com.algaworks.impressaonota.NotaFiscalInterface;
import com.algaworks.nota.Nota;
/*
 * Classe responsável por criar o objeto do tipo Pessoa Física (FactoryMethod),
 * Faz sobrecarga do método calculoImpostos() da classe pai (Abstract Nota).
 */
public class EmissaoNotaPF extends Nota{

	@Override
	protected NotaFiscalInterface calculoImpostos() {
		return new ImplementsNotaPF();
	}
}
