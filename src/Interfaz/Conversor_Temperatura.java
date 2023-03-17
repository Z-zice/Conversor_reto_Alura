package Interfaz;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor_Temperatura {
	
	private double celcius_Fahrenheit = 33.8;
	private double celcius_Kelvin = 274.15;
	private double celcius_Rankine = 491.67;
	
	private int opcionesReiniciar;
	DecimalFormat decimales = new DecimalFormat("#.##");
	
	public int getReiniciar() {
		return this.opcionesReiniciar;
	}

	public void convertirTemperatura(String temperaturaElejida , int gradoElejido) {
		switch(temperaturaElejida) {
		
		case "Celsius a Fahrenheit":
			String valor =decimales.format((gradoElejido* 1.8)+32);
			JOptionPane.showMessageDialog(null,"Tienes : " + valor +" °F" );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			break;
		case "Celsius a Kelvin":
			String valor1 =decimales.format(gradoElejido + 273.15);
			JOptionPane.showMessageDialog(null,"Tienes :" + valor1 +"K" );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			break;
		case "Celcius a Rankine":
			String valor2 =decimales.format((gradoElejido* 1.8)+493.47);
			JOptionPane.showMessageDialog(null,"Tienes : " + valor2 +" °R" );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			break;
		}
		
		
	}

}
