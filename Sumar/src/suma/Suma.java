package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		suma();
	}

	public static void suma() {
		int a,b, resultado;
		int  respuesta=1;
		try {
				
			Scanner teclado =new Scanner(System.in);
			while (respuesta==1){
				System.out.println("Introduce un número positivo:");
				a=teclado.nextInt();
				System.out.println("Introduce otro número positivo:");
				b=teclado.nextInt();
				if ((a > 0) && (b >0)) {
					resultado= a+b;
					System.out.println("El resultado es " + resultado);
					
				}
				else {
					System.out.println("No son positivos");
				}
				System.out.println("¿Quieres seguir sumando? Si (1)/ No (0): ");
				respuesta=teclado.nextInt();
				
			}
			teclado.close();
			}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}
