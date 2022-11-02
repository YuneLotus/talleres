package uniandes.dpoo.taller4.interfaz;
import java.util.*;
import javax.swing.*;
import java.util.Collection;

import uniandes.dpoo.taller4.modelo.RegistroTop10;

@SuppressWarnings("serial")
public class PanelTopScores extends JPanel 
{
	private InterfazLuces interfaz;
	
	/** 
	 * Esta clase se encarga de inicializar el panel que mostrara
	 * los 10 mejores jugadores de LightsOut.
	 * */
	
	@SuppressWarnings("unchecked")
	public PanelTopScores(InterfazLuces interfaz, Collection<RegistroTop10> registros){
		
		JList<String> names = new JList<String>();
		
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		modelo.addElement("<html> <title> Nombre </title> </html>");
		
		for(RegistroTop10 inregistro: registros) {
			modelo.addElement(inregistro.darNombre());
		}
		
		names.setModel((ListModel<String>) names);
		JScrollPane desplazable = new JScrollPane(names);
		
		JPanel panelPrincipal = new JPanel();
		
		panelPrincipal.add(desplazable);
	} 
	

}

/*Fuentes
 * http://www.java2s.com/example/java/swing/fill-collection-to-jlist.html
 * https://docs.oracle.com/cd/E17802_01/j2se/javase/6/jcp/beta/apidiffs/javax/swing/JList.html#:~:text=To%20create%20a%20scrolling%20list,getViewport().
 */