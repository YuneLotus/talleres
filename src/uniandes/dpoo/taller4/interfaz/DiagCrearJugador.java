package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class DiagCrearJugador extends JDialog implements ActionListener 
{
	// -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

	public final static String ACEPTAR = "ACEPTAR";
	
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	private String nombre;
	
	// -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

	private JPanel panelBotones, panelDatos;
	private JButton botonAceptar;
	private JTextField txtNombre;
	private InterfazLuces ventana;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

	public DiagCrearJugador (InterfazLuces ventana )
	{
		// dimensiones diálogo
		this.ventana = ventana;
		setTitle( "Nuevo jugador" );
        setSize( 300, 300 );
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE );
        
        setLayout( new BorderLayout( ) );
        
        JPanel panelAux = new JPanel( );
        panelAux.setBorder( new EmptyBorder( 10, 10, 10, 10 ) );
        panelAux.setLayout( new BorderLayout( ) );
        add( panelAux, BorderLayout.CENTER );
        
        // crea el panel de info
        inicializarPanelDatos( );
        panelAux.add( panelDatos, BorderLayout.CENTER );
        
        // crea el panel de botones
        inicializarPanelBotones( );
        panelAux.add( panelBotones, BorderLayout.SOUTH );
        
        setModal( true );
        setLocationRelativeTo( ventana );
        setResizable( false );
	}
	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

	public void inicializarPanelDatos( ) 
	{
		panelDatos = new JPanel( );
        panelDatos.setLayout( new GridLayout( 4, 1, 1, 6 ) );
        panelDatos.setBorder( BorderFactory.createTitledBorder( "Nombre del jugador" ) );
        
        // Nombre
        JPanel panelNombre = new JPanel( );
        panelNombre.setLayout( new FlowLayout( FlowLayout.RIGHT, 5, 0 ) );
        JLabel etiquetaNombre = new JLabel( "Nombre " );
        txtNombre = new JTextField( );
        txtNombre.setColumns( 15 );
        panelNombre.add( etiquetaNombre );
        panelNombre.add( txtNombre );
        panelDatos.add( panelNombre );
	}
	
	/**
	 * Inicializa el panel con el único botón
	 */
	public void inicializarPanelBotones( )
	{
		panelBotones = new JPanel( );
		panelBotones.setLayout(new GridLayout( 1, 1, 10, 10 ));
		
		// Aceptar
		botonAceptar = new JButton( );
        botonAceptar.setText( "Aceptar" );
        botonAceptar.setActionCommand( ACEPTAR );
        botonAceptar.addActionListener( this );
        panelBotones.add( botonAceptar );
	}
	
	public void actionPerformed( ActionEvent pEvento ) 
	{
		String comando = pEvento.getActionCommand();
		
		if ( comando.equals( ACEPTAR ) ) {
			System.out.println("ACEPTAR clickeado\n");
			nombre = txtNombre.getText( );
			
			if (nombre == null || nombre.equals( "" )) { }
			else 
			{
				ventana.updateJugador( nombre );
				dispose();
			}
		}
		
	}
}
