package com.factorymethod.logger;

import com.factorymethod.impressaolog.ImpressaoLog;

public abstract class Logger {
	
	protected abstract ImpressaoLog gerarLog();
	
	public void enviarLog(String mensagem) {
		gerarLog().impressao(mensagem);
	}
	
}
