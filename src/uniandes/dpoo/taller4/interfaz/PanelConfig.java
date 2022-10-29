package uniandes.dpoo.taller4.interfaz;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class PanelConfig {
	
	JLabel dificultad = new JLabel("Dificultad"); 

	ButtonGroup niveles = new ButtonGroup();
	
	JRadioButton facil = new JRadioButton();
	
	JRadioButton medio = new JRadioButton();
	
	JRadioButton dificil = new JRadioButton();
	
	niveles.add(facil);
	niveles.add(medio);
	niveles.add(dificil);
	
	JComboBox<String> lista = new JComboBox<String>();
	
	lista.addItem("5X5");
	lista.addItem("7X7");
	lista.addItem("9X9");
	
	
	/*Crear el panel
	 * Añadir cosas al panel
	 * Crear más labels antes de lo anterior 
	 * Revisar por qué me marca las cosas como si estuvieran mal
	 */
	
	
	
}
