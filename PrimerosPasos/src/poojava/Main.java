package poojava;

public class Main {
	public static void main(String[] args) {
		Tv tv1;
		tv1 = new Tv();
		
		tv1.encender();
		System.out.println("Encendido:" + tv1.encendido);
		
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.subirvolumen();
		tv1.bajarvolumen();
		System.out.println("Volumen:" + tv1.encendido);
	}
	
	

}

