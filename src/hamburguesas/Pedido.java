package hamburguesas;

import java.io.File;

public class Pedido
{
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	
	public int getIdPedido()
	{
		return this.idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem)
	{
		
	}
	
	private int getPrecioNetoPedido()
	{
		return 0;
	}
	
	private int getPrecioTotalPedido()
	{
		return 0;
	}
	
	private int getPrecioIVAPedido()
	{
		return 0;
	}
	
	private String generarTextoFactura()
	{
		return null;
	}
	
	public void guardarFactura(File archivo)
	{
		
	}
}
