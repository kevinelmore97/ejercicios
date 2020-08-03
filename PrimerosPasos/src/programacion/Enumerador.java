package programacion;

enum transporte{
	coche(60), camion(50), avion(600), tren(70), barco(20);
	private int velocidad;
	
	transporte (int s) {velocidad=s;}
	int getvelocidad() {return velocidad;}
	
}

	public class Enumerador {
		public static void main(String[] args) {
			transporte tp;
			
			System.out.println("la velocidad tipica para un avion es: " +
			transporte.avion.getvelocidad()+ "millas por hora. \n");
			
			System.out.println("todas las velocidades de transporte: ");
			for (transporte t: transporte.values() )
				System.out.println(t+ ": la velocidad tipica es " +t.getvelocidad()+" millas por hora.");
			
		}

		
		
		
}
