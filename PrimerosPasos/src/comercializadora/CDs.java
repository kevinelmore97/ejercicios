package comercializadora;

public class CDs {

		private String Titulo;
		private String Artista;
		private int Lanzamiento;
		private double ValorCDs;
		private double Desc = 10;
		
		
		
		public CDs(String titulo, double valorCDs) {
			super();
			Titulo = titulo;
			ValorCDs = valorCDs;
			
		}
		
		public String getTitulo() {
			return Titulo;
		}
		public void setTitulo(String titulo) {
			Titulo = titulo;
		}
		public String getArtista() {
			return Artista;
		}
		public void setInterprete(String artista) {
			Artista = artista;
		}
		public int Lanzamiento() {
			return Lanzamiento;
		}
		public void setLanzamiento(int lanzamiento) {
			Lanzamiento = lanzamiento;
		}
		public double getValorCDs() {
			return ValorCDs;
		}
		public void setValorCd(double valorCDs) {
			ValorCDs = valorCDs;
		} 

		public double getValorcd1() {
			double total_pagar = 0;
			total_pagar = ValorCDs * 0.09 - Desc / 100 ;
			
			return ValorCDs + total_pagar;
			
		}
	}

