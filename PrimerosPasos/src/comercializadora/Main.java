package comercializadora;

public class Main {
	public static void main(String[] args) {

		Libros lbr1 = new Libros("Luna de plutòn", 22);
		Libros lbr2 = new Libros("101 pos del kamasutra", 44);
		
		CDs Cd1 = new CDs("linkin park", 33);
		CDs Cd2 = new CDs("tiko tiko", 11);

       
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO DE luna de plutòn:" + lbr1.getPrecio1() +  "$");
		System.out.println("EL LIBRO 101 pos del kamasutra CUESTA : " + lbr2.getPrecio1() +  "$"); 
		
		System.out.println("                                                 ");
		
		System.out.println("EL Precio DEL CD DE linkin park ES :" +  Cd1.getValorcd1() +  "$");
		System.out.println("EL Precio DEL CD DE tiko tiko ES : "  + Cd2.getValorcd1() +  "$");
	}

}

