package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Tablero;

@SuppressWarnings("serial")
public class PanelPuntaje extends JPanel 
{
	//Atributos 
		private InterfazLuces interfaz;
		
		private JTextField txtJugadas;
		
		private JTextField txtJugador;
		
		//Constructor
		public PanelPuntaje (InterfazLuces pPrincipal) {
			interfaz = pPrincipal;
			JPanel panelInfoJugadas = new JPanel();
			panelInfoJugadas.setLayout(new BorderLayout());
			
			JPanel panelInfoJugadas1 = new JPanel();
			panelInfoJugadas1.setLayout(new GridLayout(3, 4));
			panelInfoJugadas1.setBorder(new EmptyBorder(5, 0, 0, 0));
			
			JLabel etiquetaJugadas = new JLabel("Jugadas: ");
			etiquetaJugadas.setHorizontalAlignment(JLabel.LEFT);
			panelInfoJugadas1.add(etiquetaJugadas);
			txtJugadas = new JTextField();
			txtJugadas.setEditable(false);
			panelInfoJugadas1.add(txtJugadas);
			
			JLabel etiquetaJugador = new JLabel("Jugadas: ");
			etiquetaJugador.setHorizontalAlignment(JLabel.LEFT);
			panelInfoJugadas1.add(etiquetaJugador);
			txtJugador = new JTextField();
			txtJugador.setEditable(false);
			panelInfoJugadas1.add(txtJugador);
			
			panelInfoJugadas.add(panelInfoJugadas1, BorderLayout.NORTH);

		}
		
	//Metodos
		public void actualizarInformacion(Tablero tablero, RegistroTop10 registro) {
			txtJugadas.setText(String.valueOf(tablero.darJugadas()));
			txtJugador.setText(registro.darNombre());
			
		}
}
