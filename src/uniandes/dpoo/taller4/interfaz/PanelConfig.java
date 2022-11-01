package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import javax.swing.JComboBox;

public class PanelConfig extends JPanel implements  ActionListener
{
	
	private static final String Facil = "facil";
	
	private static final String Medio = "medio";
	
	private static final String Dificil = "dificil";

	private InterfazLuces interfaz;
	
	private JComboBox<String> lista;
	
	private JRadioButton facil;
	
	private JRadioButton medio;
	
	private JRadioButton dificil;
	
	private JLabel dificultad;
	
	private ButtonGroup niveles;
	
	private JPanel buttons;
	
	private String[] opciones;
	
	private JLabel size;
	
	private JPanel listaYTexto;
	
	private JPanel config;
	
	/** 
	 * Este metodo se encarga de crear todo el panel de configuración
	 * del tablero
	 * */

	public PanelConfig() {
		
		JLabel dificultad = new JLabel("Dificultad");
		dificultad.setForeground(Color.WHITE);
		
		JRadioButton facil = new JRadioButton();
	
		JRadioButton medio = new JRadioButton();
	
		JRadioButton dificil = new JRadioButton();
	
		ButtonGroup niveles = new ButtonGroup();
	
		facil.setText("Fácil");
		facil.setActionCommand(Facil);
		facil.addActionListener(this);
		medio.setText("Medio");
		medio.setActionCommand(Medio);
		medio.addActionListener(this);
		dificil.setText("Difícil");
		dificil.setActionCommand(Dificil);
		dificil.addActionListener(this);
		
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
	
	/** 
	 * Este metodo se encarga de obtener la opción de tamaño
	 * seleccionada por el usuario y mandar el número de filas
	 * y columnas a la interfazLuces
	 * */
	
	public void sizeSeleccionado() {
		
        String tamSeleccionado = "";
        int fila = 0;
        int columna = 0;
        if(lista.getSelectedItem( )!=null)
        {
            tamSeleccionado = (( String )lista.getSelectedItem( ));
            fila = filaSeleccionada(tamSeleccionado);
            
            // se supone que 
            interfaz.inicializarTablero(fila);
        }
       
	}
	
	/** 
	 * Este metodo se encarga de dar la fila seleccionada a partir de 
	 * del tamaño seleccionado
	 * 
	 * @param String tamSeleccionado: el tamaño del tablero seleccionado por 
	 * el usuario
	 * */
	
	public int filaSeleccionada(String tamSeleccionado) {
		
		int fila = 0;
		if(tamSeleccionado == "5x5") {
			fila = 5;
			return fila;
		}
		
		if(tamSeleccionado == "6x6") {
			fila = 6;
			return fila;
		}
		
		if(tamSeleccionado == "7x7") {
			fila = 7;
			return fila;
		}
		if(tamSeleccionado == "8x8") {
			fila = 8;
			return fila;
		}
		if(tamSeleccionado == "9x9") {
			fila = 9;
			return fila;
		}
		
		if(tamSeleccionado == "10x10") {
			fila = 10;
			return fila;
		}
		
		return fila;
		
	}
	
	/** 
	 * Este metodo se encarga de dar la columna seleccionada a partir de 
	 * del tamaño seleccionado
	 * 
	 * @param String tamSeleccionado: el tamaño del tablero seleccionado por 
	 * el usuario
	 * */
	public int columnaSeleccionada(String tamSeleccionado) {
		
		int columna = 0;
		if(tamSeleccionado == "5X5") {
			columna = 5;
			return columna;
		}
		
		if(tamSeleccionado == "6X6") {
			columna = 6;
			return columna;
		}
		
		if(tamSeleccionado == "7X7") {
			columna = 7;
			return columna;
		}
		if(tamSeleccionado == "8X8") {
			columna = 8;
			return columna;
		}
		if(tamSeleccionado == "9X9") {
			columna = 9;
			return columna;
		}
		
		if(tamSeleccionado == "10X10") {
			columna = 10;
			return columna;
		}
		
		return columna;
		
	}
	
	/** 
	 * Este metodo se encarga de mandar el nivel de dificultad a la interfaz
	 * 
	 * @param ActionEvent nivel: evento que hace el usuario.
	 * */
	@Override
	public void actionPerformed(ActionEvent nivel) {
		if (Facil.equals(nivel.getActionCommand())) {
            interfaz.desordenarTablero(5);
        }
		if(Medio.equals(nivel.getActionCommand())) {
			interfaz.desordenarTablero(10);
		}
		if(Dificil.equals(nivel.getActionCommand())) {
			interfaz.desordenarTablero(15);
		}
		
	}
	
}
/* Sources:
 * https://stackoverflow.com/questions/15882886/jlabel-color-change
 * https://www.geeksforgeeks.org/jradiobutton-java-swing/
 * https://stackoverflow.com/questions/18941840/add-buttongroup-to-jpanel
 * https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
 * https://www.geeksforgeeks.org/java-swing-jcombobox-examples/
 * https://examples.javacodegeeks.com/desktop-java/swing/jradiobutton/get-selected-jradiobutton-from-buttongroup/#:~
 * :text=Use%20ButtonGroup.,to%20get%20the%20user's%20selection.
 */
  
