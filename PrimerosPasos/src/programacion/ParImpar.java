package programacion;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		System.out.println("Leer numero: ");
		Scanner in = new Scanner(System.in);
        numero = in.nextInt();
        if(numero%2==0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
	}

}
