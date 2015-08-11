package com.sistemavendas.venda;

import java.io.IOException;
import java.util.Properties;

import com.sistemavendas.boleta.Boleta;
import com.sistemavendas.nfe.NFe;
/*
*Classe (Fábrica) responsável por criar os objetos do tipo Boleto e NFe
*/
public class LojaFactory implements ModuloVendaAbstract{
	
	Properties prop;
	String nomeBol;
	String nomeNFe;

	public LojaFactory(String boleta, String nfe) {
		this.prop = new Properties();
		this.nomeBol = boleta;
		this.nomeNFe = nfe;
	}

	public Boleta criarBoleta() {
		try {
			prop.load(this.getClass().getResourceAsStream("/config.properties"));
			//Acessa o arquivo config.properties e pega o nome da classe pela chave passada
			//como parametro no construtor.
			Boleta boleta = (Boleta) Class.forName(this.prop.getProperty(nomeBol)).newInstance();
			return boleta;
			
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println("Arquivo não acessado: " + e);
		}
		return null;
	}

	public NFe criarNFe() {

		try {
			prop.load(this.getClass().getResourceAsStream("/config.properties"));
			//Acessa properties e pega o nome da classe pelo parametro String passado.
			NFe nfe = (NFe) Class.forName(this.prop.getProperty(nomeNFe)).newInstance();
			return nfe;
			
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println("Arquivo não acessado: " + e);
		}
		return null;
	}

}
