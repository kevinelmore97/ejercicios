package programacion;

import java.util.Scanner;

public class EnumJava {
	enum piedra{
		CALIZA(1200), MARMOL(1423.55), PIZARRA(1325), CUARZITA(1466.22);
		double peso;
		private piedra (double peso) {
			this.peso = peso;
		}
		public double darpeso() {
			return peso;
			
		}
	}
	public void ver (String piedra) {
		piedra piedra2=Enum.valueOf(piedra.class, piedra);
		System.out.println("piedra "+ piedra2);
		System.out.println("peso "+ piedra2.darpeso());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("ingrese el tipo de piedra: ");
		String piedra = entrada.next() .toUpperCase();
		EnumJava n  = new EnumJava();
		n.ver(piedra);
	}

}
