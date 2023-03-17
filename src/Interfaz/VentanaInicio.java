package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class VentanaInicio {

	private JFrame frame;
	private int intentos = 3;
	private int numeroConvertir;
	private int gradosConber;
	private int opcionesReiniciar;

	public int getOpcionesReiniciar() {
		return opcionesReiniciar;
	}

	public void setOpcionesReiniciar(int opcionesReiniciar) {
		this.opcionesReiniciar = opcionesReiniciar;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio window = new VentanaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaInicio() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}
	
	public void visible() {
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBackground(new Color(0, 64, 0));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\herna\\OneDrive\\Escritorio\\CURSO ALURA LATAM\\Primer proyecto encriptador\\Encriptador\\Vector.png"));
		frame.setAlwaysOnTop(true);
		frame.setBounds(800, 450, 310, 159);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(70, 11, 149, 35);
		frame.getContentPane().add(lblNewLabel);
		
		
		// Boton inicio
		String conv = "Conversor de moneda";
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				frame.setVisible(false);
				String OpcionElejida = (JOptionPane.showInputDialog(null,"Selecciona una opcion","Conversor",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de moneda","Conversor de temperatura"},"Conversor")).toString();
				switch(OpcionElejida) {
				
				case "Conversor de moneda":
					Conversor_Moneda convertir = new Conversor_Moneda();
					numeroConvertir = verificarNumero();
					String monedaElejida = (JOptionPane.showInputDialog(null,"Elije la moneda al que deseas convertir tu dinero","Conversor",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Pesos a Dolar","Pesos a Libra","Pesos a Yen","Pesos a Won Coreano","Pesos a Euro","Dolar a Pesos","Libra a Pesos","Yen a Pesos","Won Coreano a Pesos","Euro a Pesos"},"Menu")).toString();
					convertir.convertirMoneda(monedaElejida,numeroConvertir);
					opcionesReiniciar = convertir.getReiniciar();
					break;
					
					
				case "Conversor de temperatura":
					Conversor_Temperatura conTemp = new Conversor_Temperatura();
					gradosConber = verificarGrados();
					String temperaturaElejida = (JOptionPane.showInputDialog(null,"Elije la temperatura que deseas convertir","Conversor",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Celsius a Fahrenheit","Celsius a Kelvin","Celcius a Rankine"},"Menu")).toString();
					conTemp.convertirTemperatura(temperaturaElejida, gradosConber);
					opcionesReiniciar = conTemp.getReiniciar();
					break;
				
				
				
				}
				if(opcionesReiniciar == 0) {
					VentanaInicio nuevaVentana = new VentanaInicio();
					nuevaVentana.visible();
				}
				else if (opcionesReiniciar== 1 || opcionesReiniciar == 2) {
					JOptionPane.showMessageDialog(null,"Fin del programa" );
					System. exit(0);
				}
			}
		});
		btnNewButton.setBounds(103, 57, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
	
	// verificara que el caracter sea un numero. y devuelve en numero en int
		public int verificarGrados() {
			int numero=0;
			while(intentos>=0) {
				if(intentos == 0 ) {
					JOptionPane.showMessageDialog(null, "A superado el maximo de intentos, fin del programa");
					System. exit(0);
				}
				try {
					 numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los grados a convertir","Input",JOptionPane.QUESTION_MESSAGE).toString());
					if(numero>=0) {
						break;
					}
				}catch( NumberFormatException exception){
					JOptionPane.showMessageDialog(null, "Ingrese numeros.");
					intentos --;
				}
			}
			return numero;
		
		}
		// verificara que el caracter sea un numero. y devuelve en numero en int
		public  int verificarNumero() {
			int numero=0;
			while(intentos>=0) {
				if(intentos == 0 ) {
					JOptionPane.showMessageDialog(null, "A superado el maximo de intentos, fin del programa");
					throw new RuntimeException("terminado");
				}
				try {
					 numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir","Input",JOptionPane.QUESTION_MESSAGE).toString());
					if(numero>=0) {
						break;
					}
				}catch( NumberFormatException exception){
					JOptionPane.showMessageDialog(null, "Ingrese numeros.");
					intentos --;
				}
			}
			return numero;
		
		
	}
		
	
}
