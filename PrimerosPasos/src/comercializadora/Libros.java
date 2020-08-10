package comercializadora;

public class Libros {
	private String Nombre;
	private String Autor;
	private int Fechapublicacion;
	private String Editorial;
	private int ISBN;
	private double Precio;
	private double Desc = 20;
	
	
	public Libros(String nombre, double precio) {
		super();
		Nombre = nombre;
		Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getFechapublicacion() {
		return Fechapublicacion;
	}

	public void setFechapublicacion(int fechapublicacion) {
		Fechapublicacion = fechapublicacion;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	public double getPrecio1() {
		double total_pagar = 0;
		total_pagar = Precio * 0.09 - Desc / 100 ;
		
		return Precio + total_pagar;
	}
}

