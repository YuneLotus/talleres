package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


/**
 * Panel del juego
 * Contiene tablero con luces
 */
public class PanelTablero extends JPanel implements MouseListener 
{
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	
	// -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

	/**
	 * Dibuja los elementos gráficos en el canvas de dibujo del panel.
	 * Llamado al abrir la ventana de la aplicación y con método repaint()
	 * @param g Gráficos de las luces. g != null
	 */
	public void paint( Graphics g )
	{
		
	}
	
	public void mouseEntered(MouseEvent evento) {
		// TODO Auto-generated method stub
		System.out.println("evento mouseEntered");
	}
	
	public void mouseExited(MouseEvent evento) {
		// TODO Auto-generated method stub
		System.out.println("evento mouseExited");		
	}
}
