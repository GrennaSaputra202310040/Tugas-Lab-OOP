package com.cobaan1.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class App {
	
	public static void main(String[] args) {
		String inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		
		App mytestApp = new App();
		
		while (inputTextbox.isEmpty()) {
			inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		}

		int btnValue =JOptionPane.showConfirmDialog(null, "Apakah Kamu Manusia","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		String label="";
		if (btnValue==0){
			String inputasl = JOptionPane.showInputDialog(null,"Dimana Kamu Berasal");
			
			label = inputTextbox + " Kamu Adalah Manusia Dan Tinggal Di " + inputasl  ;
		}else if(btnValue == 1){
			label = inputTextbox + " Kamu Adalah Alien";
		}else{
			label = inputTextbox + " Kamu Bukan Manusia dan Alien";
		}
		JOptionPane.showMessageDialog(null, label);
	}
	
	public boolean isNumber(String input) {
		
		try {
			Double x = Double.parseDouble(input);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
}