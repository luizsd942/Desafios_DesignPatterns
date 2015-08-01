package com.factorymethod.tipolog.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.factorymethod.impressaolog.ImpressaoLog;

public class ImpressaoLogTXT implements ImpressaoLog {

	private String nomeArquivo;
	
	public ImpressaoLogTXT(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void impressao(String mensagem) {

		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		//String s = sdf.format(Date.toString());
		FileWriter arq;
		
		try {
			URL url = this.getClass().getClassLoader().getResource("geracaolog-cliente/src/main/resources/");
			//File arquivoCsv = new File(uri);
			arq = new FileWriter(url+nomeArquivo,true);
			PrintWriter gravarArq = new PrintWriter(arq);
			
			gravarArq.printf("+----- Log -----+%n");
			gravarArq.printf("Data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
					+"-"+ hora.format(DateTimeFormatter.ofPattern("HH:mm:ss"))+ "%nMensagem: " + mensagem);
			gravarArq.printf("%n+---------------+%n");
			
			System.out.println("A mensagem: "+ mensagem +"\nfoi enviada com sucesso.");
			
			arq.close();
			
		} catch (IOException e) {
			System.err.println("Não foi possível encontrar o caminho do arquivo... "
					+	e.getMessage());
		}
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
}
