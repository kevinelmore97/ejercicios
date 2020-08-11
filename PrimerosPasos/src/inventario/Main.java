package inventario;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void mostrar(ArrayList<Libros> li) {
		System.out.println("inventario");
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
	  public static void buscarcodigo(ArrayList<Libros> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("solicite el codigo del libro: ");
		int codigoingresado = entrada.nextInt();
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				System.out.println(li.get(i));	
			}
			
		}
	}
	
       public static void comprarLibro (ArrayList<Libros> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("solicite el codigo del libro");
		int codigoingresado = entrada.nextInt();
		int cantidad;
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				cantidad = li.get(i).getCantidadexistente();
				if(cantidad > 1) {
					cantidad -= 1;
					System.out.println("gracias por su compra, vuelva pronto");
					li.get(i).setCantidadexistente(cantidad);
					actualizar(li);
				}else {
					cantidad = 0;
					System.out.println("gracias por preferirnos");
					System.out.println("el libro que ha solicitado ya no se encuentra en stock");
					li.get(i).setCantidadexistente(cantidad);
					actualizar(li);
				}
			}
		}
	}
		
	public static void actualizar(ArrayList<Libros> li) {
		
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
		
	public static void librosMasCaros (ArrayList<Libros> li) {
		System.out.println("buscando Libros Mas Caros");
	}
	
	
		public static void main(String[] args) {
			
			ArrayList<Libros> libros = new ArrayList<Libros>();
			
			Libros l1 = new Libros(1522, 2, "la casa de los dibujos", "atalaya", 90.60);
			Libros l2 = new Libros(6522, 1, "Caperucita roja", "frederick nieto", 20.18);
			Libros l3 = new Libros(1800, 3, " luna de pluton ","Dross",34.60);
			Libros l4 = new Libros(7845, 4, " Pulgarcito" , "edgar poe ",55.75);
			Libros l5 = new Libros(8965, 5, " la odisea" , "benito aguiero",19.08);
			
			
			
			libros.add(l1);
			libros.add(l2);
			libros.add(l3); 
			libros.add(l4);
			libros.add(l5);
			
			mostrar(libros);
 }
}
