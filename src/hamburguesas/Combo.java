package hamburguesas;

import hamburguesas.ProductoMenu;

public class Combo
{
	private double descuento;
	private String nombre;
	
	public Combo(String nombre, double descuento)
	{
		this.nombre = nombre;
		this.descuento = descuento;
	}
	
	public void agregarItemACombo(Producto itemCombo)
	{
		
	}
	
	public int getPrecio()
	{
		int precioBase = ProductoMenu.getPrecio();
		int precio = (int) (precioBase - descuento);
		return precio;
	}
	
	public String generarTextoFactura()
	{
		return null;
		
	}
	
	public String getNombre()
	{
		return nombre;
	}
}
