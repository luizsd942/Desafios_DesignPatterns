package com.factorymethod;

import javax.swing.JOptionPane;

import com.factorymethod.logger.Logger;
import com.factorymethod.tipolog.txt.GeradorLogTXT;

public class DeixarRecado {

	public static void main(String []args) {
		Logger logger = new GeradorLogTXT("recados.txt");
		String mensagem = JOptionPane.showInputDialog(null, "Digite o recado:");
		logger.enviarLog(mensagem);
		
		JOptionPane.showConfirmDialog(null, "Obrigado!");
		
	}
}
