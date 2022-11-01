package uniandes.dpoo.taller4.interfaz;
import java.util.*;
import javax.swing.*;
import java.util.Collection;

import uniandes.dpoo.taller4.modelo.RegistroTop10;

public class PanelTop10 {
	private InterfazLuces interfaz;
	
	public PanelTop10(InterfazLuces interfaz, Collection<RegistroTop10> registros){
		
		JList<String> names = new JList<String>();
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		modelo.addElement("<html> <title> Nombre </title> </html>");
		
		int persona = 1;
		for(RegistroTop10 inregistro: registros) {
			modelo.addElement(inregistro.darNombre());
		}
		
		names.setModel((ListModel<String>) names);
		
	} 
	

}

/*Fuentes
 * http://www.java2s.com/example/java/swing/fill-collection-to-jlist.html
 */