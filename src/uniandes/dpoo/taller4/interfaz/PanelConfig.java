package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class PanelConfig {
	
	private InterfazLuces inferaz;
	
	
	public PanelConfig() {
		
		JLabel dificultad = new JLabel("Dificultad");
		dificultad.setForeground(Color.WHITE);
		
		JRadioButton facil = new JRadioButton();
	
		JRadioButton medio = new JRadioButton();
	
		JRadioButton dificil = new JRadioButton();
	
		ButtonGroup niveles = new ButtonGroup();
	
		facil.setText("Fácil");
		medio.setText("Medio");
		dificil.setText("Difícil");
		
		niveles.add(facil);
		niveles.add(medio);
		niveles.add(dificil);
		
		JPanel buttons = new JPanel();
		buttons.add(dificultad);
		buttons.add(facil);
		buttons.add(medio);
		buttons.add(dificil);
		buttons.setBackground(Color.BLUE);

		
		String[] opciones = {"5x5", "6x6", "7x7", "8x8", "9x9","10x10"};
		JLabel size = new JLabel("Tamaño");
		size.setForeground(Color.WHITE);
		
		
		JComboBox<String> lista = new JComboBox<String>(opciones);
		
		JPanel listaYTexto = new JPanel(new GridLayout(1,2));
		
		listaYTexto.add(size, 1, 1);
		listaYTexto.add(lista, 1, 2);
		listaYTexto.setBackground(Color.BLUE);
		
		JPanel config = new JPanel(new BorderLayout());
		
		config.add(listaYTexto, BorderLayout.WEST);
		config.add(buttons, BorderLayout.EAST);	
		config.setBackground(Color.BLUE);
		
	}
	
	
/*TODO:
 * metodo listener  para la lista
 * Metodo Listener para cada botton
 * 
 */
	
	
}
/* Sources:
 * https://stackoverflow.com/questions/15882886/jlabel-color-change
 * https://www.geeksforgeeks.org/jradiobutton-java-swing/
 * https://stackoverflow.com/questions/18941840/add-buttongroup-to-jpanel
 * https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
 * 
 */
  
