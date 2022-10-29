package uniandes.dpoo.taller4.interfaz;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class PanelConfig {
	
	JLabel dificultad = new JLabel("Dificultad"); 

	
	
	JRadioButton facil = new JRadioButton();
	
	JRadioButton medio = new JRadioButton();
	
	JRadioButton dificil = new JRadioButton();
	
	ButtonGroup niveles = new ButtonGroup();
	
	niveles.add(facil);
	niveles.add(medio);
	niveles.add(dificil);
	

	String[] opciones = {"5x5", "6x6","7x7"};
	JLabel size = new JLabel("tamaño");
	
	JComboBox<String> lista = new JComboBox<String>(opciones);
	
	
	

	/*Crear el panel
	 * Añadir cosas al panel
	 * Crear más labels antes de lo anterior 
	 * Revisar por qué me marca las cosas como si estuvieran mal
	 * Hacer panel
	 * Pintar un rectángulo en el panel
	 */
	
	
	
}
