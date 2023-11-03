
package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

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
	private String nombre;
	private int puntaje_curr, jugadas_curr;
	
	// -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------
	private PanelConfig panelConfig;
	private PanelMenu panelMenu;
	private PanelTablero panelTablero;
	private PanelPuntaje panelPuntaje;
	private PanelTopScores panelTopScores;
	private DiagCrearJugador dCrearJugador;
	
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
		tablero = new Tablero( 5 ); // TODO: añadir tamaño del tablero
		tablero.desordenar( 5 ); // TODO: poner dificultad
		
		// Crea el top score
		topscores = new Top10( );
		topscores.cargarRecords( puntajesGuardados );
		
		// Configura la interfaz
		setLayout( new BorderLayout( ) );
		// Añade los paneles
		panelConfig = 	new PanelConfig( this );
		panelMenu = 	new PanelMenu( this );
		panelTablero = 	new PanelTablero( this, tablero );
		panelPuntaje = 	new PanelPuntaje( this );
		//panelTopScores = new PanelTopScores( this, topscores.darRegistros() );
		
		// crea el primer jugador
		cambiarJugador( );
		
		add( panelConfig,	BorderLayout.NORTH );
		add( panelMenu	,	BorderLayout.EAST );
		add( panelTablero,	BorderLayout.CENTER );
		add( panelPuntaje,	BorderLayout.SOUTH );
		//add( panelTopScores, BorderLayout.WEST );
		
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
		
		panelTablero = new PanelTablero( this, tablero ); // TODO: definir parámetros
		add( panelTablero, BorderLayout.CENTER );
		validate( );
	}
	
	/**
	 * Actualiza el panel de 
	 * @param tam
	 */
	public void actualizarPanelPuntaje( )
	{
		try 
		{
			remove( panelPuntaje );
			
			panelPuntaje = new PanelPuntaje( this );
			add( panelPuntaje, BorderLayout.SOUTH );
			validate( );
		}
		catch (Error e)
		{
			System.out.println("Aquí");
		}
	}
	
	
	/**
	 * Inicializa el tablero
	 * @param tam Tamaño del tablero
	 */
	public void inicializarTablero( int tam ) 
	{
		this.tablero = new Tablero( tam );
		System.out.println("Tablero inicializado a tamaño " + tam + "\n");
	}
	
	
	/**
	 * Desordena el tablero
	 * @param dif Dificultad del tablero
	 */
	public void desordenarTablero( int dif )
	{
		this.tablero.desordenar( dif );
	}
	
	
	/**
	 * Reinicia el tablero
	 */
	public void reiniciarTablero( ) 
	{
		this.tablero.reiniciar( );
	}
	
	/**
	 * Juega en el tablero
	 */
	public void jugarTablero (int fila, int columna ) 
	{
		this.tablero.jugar(fila, columna);
	}
	
	
	/**
	 * Cambia el jugador que esté jugando actualmente 
	 */
	public void updateJugador( String nombre ) 
	{
		this.nombre = nombre;
		this.puntaje_curr = 0;
		this.jugadas_curr = 0;
		System.out.println("Nombre: " + this.nombre + "\nPuntaje actual: " + this.puntaje_curr + "\n");
		
	}
	
	public void cambiarJugador( ) 
	{
		// le pide, al inicio del juego, que ingrese nombre de jugador
		dCrearJugador = new DiagCrearJugador( this );
		dCrearJugador.setVisible( true );
		// actualiza el panel del puntaje
		actualizarPanelPuntaje( );
	}
	
	/**
	 * Devuelve el nombre del jugador actual
	 */
	public String getNombreCurr( )
	{
		return this.nombre;
	}
	
	/**
	 * Devuelve el puntaje del jugador actual
	 */
	public int getPuntajeCurr( ) 
	{
		return this.puntaje_curr;
	}
	
	/**
	 * Devuelve el número de jugadas realizadas
	 */
	public int getJugadasCurr( ) 
	{
		return this.jugadas_curr;
	}
	
	
	/**
	 * Cierra la aplicación y guarda puntajes
	 */
	public void dispose( ) 
	{
		System.out.println( "Llamando dispose( ... ) en InterfazLuces (JFrame)" );
		
		// sobreescribe el CSV de puntajes
		File savedScores = new File( "/data/top10.csv" );
		try {
			topscores.salvarRecords( savedScores );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
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
