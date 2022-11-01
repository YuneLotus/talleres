package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class PanelMenu extends JPanel implements ActionListener {
	private static final String NUEVO = "NUEVO";
	private static final String REINICIAR = "REINICIAR";
	private static final String TOP_10 = "TOP-10";
	private static final String CAMBIAR_JUGADOR = "CAMBIAR JUGADOR";
	
	//Atributos
	private InterfazLuces principal;
	
	private JButton btnNuevo;
	
	private JButton btnReiniciar;
	
	private JButton btnTop10;
	
	private JButton btnCambiarJugador;
	
	//Constructores
	public PanelMenu (InterfazLuces pPrincipal) { 
		principal = pPrincipal;
		
		setBorder(new TitledBorder ("Menu"));
		setLayout(new GridLayout(1, 4));
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setActionCommand(NUEVO);
		btnNuevo.addActionListener(this);
		add(btnNuevo);
		
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setActionCommand(REINICIAR);
		btnReiniciar.addActionListener(this);
		add(btnReiniciar);
		
		
		btnTop10 = new JButton("Top-10");
		btnTop10.setActionCommand(TOP_10);
		btnTop10.addActionListener(this);
		add(btnTop10);
		
		
		btnCambiarJugador = new JButton("Cambiar Jugador");
		btnCambiarJugador.setActionCommand(TOP_10);
		btnCambiarJugador.addActionListener(this);
		add(btnCambiarJugador);
	}
	
	//Métodos
	public void actionPerformed(ActionEvent pOpcion) {
		if(NUEVO.equals(pOpcion.getActionCommand())) {
			principal.inicializarTablero();
		}
		else if(REINICIAR.equals(pOpcion.getActionCommand())) {
			principal.reqFuncReiniciar();
		}
		else if(TOP_10.equals(pOpcion.getActionCommand())) {
			principal.reqFuncTop10();
		}
		else if(CAMBIAR_JUGADOR.equals(pOpcion.getActionCommand())) {
			principal.reqFuncCambiarJugador();
		}
	}
	
}
