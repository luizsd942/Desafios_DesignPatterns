package com.factorymethod.tipolog.txt;

import com.factorymethod.impressaolog.ImpressaoLog;
import com.factorymethod.logger.Logger;

public class GeradorLogTXT extends Logger{

	private String nomeArquivo;
	
	@Override
	protected ImpressaoLog gerarLog() {
		return new ImpressaoLogTXT(nomeArquivo);
	}
	
	public GeradorLogTXT(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
	}
}
