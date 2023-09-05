package consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Aplicacion
{
	public static void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicacion\n");
		System.out.println("1. Mostrar el menú");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar la información de un pedido dado su id");
		System.out.println("6. Salir de la aplicacion\n");
		
	}
	public void ejecutarOpcion(int opcionSeleccionada)
	{
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				if (opcionSeleccionada == 1)
					ejecutarMostrarMenu();
				else if (opcionSeleccionada == 2)
					ejecutarIniciarPedido();
				else if (opcionSeleccionada == 3)
					ejecutarAgregarProducto();
				else if (opcionSeleccionada == 4)
					ejecutarCerrarYGuardarPedido();
				else if (opcionSeleccionada == 5)
					ejecutarGetPedidoPorId();
				else if (opcionSeleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		mostrarMenu();
		int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
		consola.ejecutarOpcion(opcion_seleccionada);
	}
	
	public static String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	public void ejecutarMostrarMenu()
	{
		
	}
	
	public void ejecutarIniciarPedido()
	{
		
	}
	
	public void ejecutarAgregarProducto()
	{
		
	}
	
	public void ejecutarCerrarYGuardarPedido()
	{
		
	}
	
	public void ejecutarGetPedidoPorId()
	{
		
	}
}