/**
 * Taller 4
 * Álvaro Bacca			202121869
 * Silvana Sandoval		20212
 * Gabriela Soler		20212
 */
package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.io.File;

import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.*;


/**
 * Ventana principal del juego
 */
@SuppressWarnings("serial")
public class InterfazLuces extends JFrame
{

	// -----------------------------------------------------------------
    // Atributos
    // ----------------------------------------------------------------
	
	private Tablero tablero;
	private Top10 topscores;
	
	// -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------
	private PanelConfig panelConfig;
	private PanelMenu panelMenu;
	private PanelTablero panelTablero;
	private PanelPuntaje panelPuntaje;
	private PanelTopScores panelTopScores;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	
	/**
	 * Crea la interfaz del juego
	 */
	public InterfazLuces( )
	{
		// archivo CSV con los puntajes guardados 
		File puntajesGuardados = new File( "/data/top10.csv" );
		
		
		setTitle("LightsOut");
		setSize( 600, 600 );
		
		// Crea el tablero
		//tablero = new Tablero( ); // TODO: añadir tamaño del tablero
		//tablero.desordenar( ); // TODO: poner dificultad
		//tablero.
		
		// Crea el top score
		
		topscores = new Top10( );
		topscores.cargarRecords( puntajesGuardados );
		
		// Configura la interfaz
		setLayout( new BorderLayout( ) );
		// Añade los paneles
		panelConfig = 	new PanelConfig( );
		panelMenu = 	new PanelMenu( this );
		panelTablero = 	new PanelTablero( );
		panelPuntaje = 	new PanelPuntaje( this );
		panelTopScores = new PanelTopScores( );
		
		add( panelConfig,	BorderLayout.NORTH );
		add( panelMenu	,	BorderLayout.EAST );
		add( panelTablero,	BorderLayout.CENTER );
		add( panelPuntaje,	BorderLayout.SOUTH );
		add( panelTopScores, BorderLayout.WEST );
		
		// Configuraciones de ventana
		setResizable( false );
		setLocationRelativeTo( null );
		
		// Configurar ventana para llamar al metodo dispose() al cerrar la ventana
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );	
	}
	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	
	/**
	 * Repinta el tablero
	 */
	public void actualizarPanelTablero( int tam )
	{
		remove( panelTablero );
		
		panelTablero = new PanelTablero( ); // TODO: definir parámetros
		add( panelTablero, BorderLayout.CENTER );
		validate( );
	}
	
	
	/**
	 * Inicializa el tablero
	 * @param tam Tamaño del tablero
	 */
	public void inicializarTablero( int tam ) 
	{
		tablero = new Tablero( tam );
	}
	
	
	/**
	 * Desordena el tablero
	 * @param dif Dificultad del tablero
	 */
	public void desordenarTablero( int dif )
	{
		tablero.desordenar( dif );
	}
	
	
	/**
	 * Reinicia el tablero
	 */
	public void reiniciarTablero( ) 
	{
		tablero.reiniciar( );
	}
	
	
	/**
	 * Cierra la aplicación y guarda puntajes
	 */
	public void dispose( ) 
	{
		System.out.println( "Llamando dispose( ... ) en InterfazLuces (JFrame)" );
		
		// sobreescribe el CSV de puntajes
		File savedScores = new File( "/data/top10.csv" );
		topscores.salvarRecords( savedScores );
		
		super.dispose();
	}
	
	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------
	
	/**
	 * Ejecuta la aplicación
	 * @param pArgs parámetros de la ejecución. No son necesarios
	 */
	public static void main( String[] pArgs ) {
		try
		{
			InterfazLuces interfaz = new InterfazLuces( );
			interfaz.setVisible(true);
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}

	}

}
