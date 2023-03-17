package Interfaz;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor_Moneda {
	
	private double peso_dolar = 0.0050;
	private double peso_euro = 0.0046;
	private double peso_libra = 0.0041;
	private double peso_yen = 0.67;
	private double peso_won_coreano = 6.51;
	
	private double dolar_peso = 200.64;
	private double euro_peso = 216.48;
	private double libra_peso = 245.95;
	private double yen_peso = 1.50;
	private double won_peso = 0.15;
	
	private int opcionesReiniciar;
	DecimalFormat decimales = new DecimalFormat("#.##");
	
	
	public void convertirMoneda(String moneda,int numero) {
		
		switch (moneda){
		
		case "Pesos a Dolar":
			
			String valor =decimales.format(numero* peso_dolar);
			JOptionPane.showMessageDialog(null,"Tienes : $ " + valor +" Dolares." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			 
			break;	
		case "Pesos a Libra":
			String valor1 =decimales.format(numero* peso_libra);
			JOptionPane.showMessageDialog(null,"Tienes : £ " + valor1 +" Libras." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			break;
			
		case "Pesos a Yen":
			String valor2 =decimales.format(numero* peso_yen);
			JOptionPane.showMessageDialog(null,"Tienes : ¥ " + valor2 +" Yen." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			break;
			
		case "Pesos a Won Coreano":
			String valor3 =decimales.format(numero* peso_won_coreano);
			JOptionPane.showMessageDialog(null,"Tienes : ₩ " + valor3 +" Won." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			break;
		case "Pesos a Euro":
			String valor4 =decimales.format(numero* peso_euro);
			JOptionPane.showMessageDialog(null,"Tienes : € " + valor4 +" Euros." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			break;
		
		case "Dolar a Pesos":
			
			String valor5 =decimales.format(numero* dolar_peso);
			JOptionPane.showMessageDialog(null,"Tienes : $" + valor5 +" Pesos." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			 
			break;	
		case "Libra a Pesos":
			String valor6 =decimales.format(numero* libra_peso);
			JOptionPane.showMessageDialog(null,"Tienes : $" + valor6 +" Pesos." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			break;
			
		case "Yen a Pesos":
			String valor7 =decimales.format(numero* yen_peso);
			JOptionPane.showMessageDialog(null,"Tienes : $" + valor7 +" Pesos." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			break;
			
		case "Won Coreano a Pesos":
			String valor8 =decimales.format(numero* won_peso);
			JOptionPane.showMessageDialog(null,"Tienes : $" + valor8 +" Pesos." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			
			break;
		case "Euro a Pesos":
			String valor9 =decimales.format(numero* euro_peso);
			JOptionPane.showMessageDialog(null,"Tienes : $" + valor9 +" Pesos." );
			opcionesReiniciar = JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
			break;
				
			
		}
	
	}
	public int getReiniciar() {
		return this.opcionesReiniciar;
	}
	

}
