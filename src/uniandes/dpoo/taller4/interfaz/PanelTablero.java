package uniandes.dpoo.taller4.interfaz;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;


/**
 * Panel del juego
 * Contiene tablero con luces
 */
public class PanelTablero extends JPanel implements MouseListener 
{
	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
	private Tablero tablero;
	
	// -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------
	private InterfazLuces ventana;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	/**
	 * Constructor
	 * @param tab Tablero utilizado en el modelo
	 */
	public PanelTablero( InterfazLuces vent, Tablero tab ) 
	{
		this.ventana = vent;
		this.tablero = tab;
	}
	
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
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor( Color.DARK_GRAY );
		
		// consigue el PNG del bombillo
		BufferedImage bombillo = null;
		try 
		{
			bombillo = ImageIO.read( new File( "data/luz.png" ));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		// consigue el tablero actual
		boolean[][] configActual;
		int filas, columnas, tam;
		Color fondoBombillo;
		
		configActual = tablero.darTablero();
		filas = configActual.length;
		columnas = configActual.length;
		// son cuadrados
		tam = (int)(getHeight() / filas);
		
		// dibuja cada recuadro individualmente
		for (int f=0; f<filas; f++) {
			for (int c=0; c<columnas; c++) {
				fondoBombillo = (configActual[f][c] ? Color.YELLOW : Color.LIGHT_GRAY );
				
				// dibuja el rectángulo
				g2d.setColor( fondoBombillo );
				g2d.fillRect( f*tam, c*tam, tam, tam );
				// dibuja el bombillo
				g2d.drawImage(bombillo, f*tam, c*tam, tam, tam, ventana);
			}
		}
	}
	
	
	public void mousePressed(MouseEvent e)  {   
		int ultima_fila = 0;
		int ultima_columna = 0;
		int click_x = e.getX();   
		int click_y = e.getY();   
		int[] casilla = convertirCoordenadasACasilla(click_x, click_y);   
		cantidades[casilla[0]][casilla[1]]++;   
		ventana.jugarTablero(casilla[0], casilla[1]);   
		this.ultima_fila = casilla[0];   
		this.ultima_columna = casilla[1];   
		repaint();  
	} 


	
	private int[] convertirCoordenadasACasilla(int x, int y)  {  
		// consigue las dimensiones del tablero
		int ladoTablero = tablero.darTablero().length;
		int altoPanelTablero = getHeight();   
		int anchoPanelTablero = getWidth();     
		
		// calcula dimensiones de cada casilla
		int altoCasilla = altoPanelTablero / ladoTablero; 
		int anchoCasilla = anchoPanelTablero / ladoTablero;   
		
		// determina fila y columna de juego
		// typecast explícito en caso de problemas
		int fila = (int) (y / altoCasilla);  
		int columna = (int) (x / anchoCasilla);    
		return new int[] { fila, columna };  
		
	} 
	

	
	public void mouseClicked( MouseEvent evento ) {}
	
	public void mouseRestored( MouseEvent evento ) {}
	
	public void mousePressed( MouseEvent e ) {}
	
	public void mouseReleased( MouseEvent e ) {}
	
	public void mouseEntered( MouseEvent evento ) {
		// TODO Auto-generated method stub
		System.out.println("evento mouseEntered");
	}
	
	public void mouseExited( MouseEvent evento ) {
		// TODO Auto-generated method stub
		System.out.println("evento mouseExited");		
	}
}
