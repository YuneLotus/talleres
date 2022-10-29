/**
 * Taller 4
 * Álvaro Bacca			202121869
 * Silvana Sandoval		20212
 * Gabriela Soler		20212
 */
package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import javax.swing.JFrame;


/**
 * Ventana principal del juego
 */
@SuppressWarnings("serial")
public class InterfazLuces extends JFrame
{

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	
	
	
	// -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------
	private PanelConfig panelConfig;
	private PanelMenu panelMenu;
	private PanelJuego panelJuego;
	private PanelPuntaje panelPuntaje;
	
	
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
