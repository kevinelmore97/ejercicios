package poojava;

public class Tv {
	public boolean encendido;
	public int volumen;
	public int canal;
	
	public void apagar() {
		encendido = false;
	}
	public void encender() {
		encendido = true;
	}
	public void avanzarCanal() {
		if(encendido)
		canal++;
	}
	public void disminuirCanal() {
		if(encendido && canal > 0)
			canal--;
	}
	public void subirvolumen() {
		if(encendido && volumen<= 100)
			volumen++;
	}
	public void bajarvolumen() {
		if(encendido && volumen > 0)
			volumen--;
	}
		
}

