package programacion;

public class NumeroMayor {
	int n1 = 15;
	int n2 = 11;
	int n3 = 12;
	
	String mensaje = "";
	
	if(n1 > n2 && n1 > n3) {
		mensaje = n1 + " es el mayor";
		//System.out.println(n1 + " es el mayor");
	} else if(n2 > n1 && n2 > n3) {
		mensaje = n2 + " es el mayor";
		//System.out.println(n2 + " es el mayor");
	} else {
		mensaje = n3 + " es el mayor";
		//System.out.println(n3 + " es el mayor");
	}
	
	System.out.println(mensaje);
	
}

}

