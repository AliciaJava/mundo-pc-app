
/**
 *
 * @AliciaJava 2024
 */

package MundoPc;


import modelo.Computadora;
import modelo.Monitor;
import modelo.Raton;
import modelo.Teclado;

public class Main {

	public static void main(String[] args) {
		
		// Crear objetos
	    Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
	    System.out.println(ratonLenovo);
	    Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
	    System.out.println(tecladoLenovo);
	    Monitor monitorLenovo = new Monitor("Lenovo", 27);
	    System.out.println(monitorLenovo);
	    // Creamos un objeto de tipo Computadora
	    Computadora computadoraLenovo =
	            new Computadora("Computadora Lenovo", monitorLenovo,
	                    tecladoLenovo, ratonLenovo);
	    System.out.println(computadoraLenovo);

	  }
		
	}