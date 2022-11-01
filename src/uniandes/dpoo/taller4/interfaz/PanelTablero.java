package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
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
	public void mousePressed(MouseEvent e)  {   
		int click_x = e.getX();   
		int click_y = e.getY();   
		int[] casilla = convertirCoordenadasACasilla(click_x, click_y);   
		cantidades[casilla[0]][casilla[1]]++;   
		principal.jugar(casilla[0], casilla[1]);   
		this.ultima_fila = casilla[0];   
		this.ultima_columna = casilla[1];   
		repaint();  
	}   
	
	private int[] convertirCoordenadasACasilla(int x, int y)  {   
		int ladoTablero = tablero.length;   
		int altoPanelTablero = getHeight();   
		int anchoPanelTablero = getWidth();     
		int altoCasilla = altoPanelTablero / ladoTablero; 
		int anchoCasilla = anchoPanelTablero / ladoTablero;   
		int fila = (int) (y / altoCasilla);  
		int columna = (int) (x / anchoCasilla);    
		return new int[] { fila, columna };  
		
	} 
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
