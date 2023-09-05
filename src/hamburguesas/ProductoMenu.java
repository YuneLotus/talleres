package hamburguesas;

public class ProductoMenu
{
	private String nombre;
	private static int precioBase;
	
	public ProductoMenu(String nombre, int precioBase)
	{
		this.nombre = nombre;
		ProductoMenu.precioBase = precioBase;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public static int getPrecio()
	{
		return precioBase;
	}
	
	public String generarTextoFactura()
	{
		return null;
	}
}
