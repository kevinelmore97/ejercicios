package programacion;
import java.util.Scanner;
public class ArregloVectores {


public static void ordenarArreglo(int s[], int MAX) {
	int i;
	int j, aux;
	for (i = 0; i < s.length - 1; i ++) {
		for (j = 0; j < s.length - 1; j ++) {
			if (s[j + 1] < s[j]) {
				aux = s[j+1]; 
				s[j+1] = s[j];
				s[j] = aux;
				
			}
		}
	}
}

//metodo que muestra los datos del vector
public static void mostrarArreglo(int s[], int MAX) {
	for (int indice = 0; indice < MAX; indice++){
		System.out.println("Datos en casilla" + indice + ":" + s[indice]);
	}
	
}

//metodo para ingresar valor en el vector
public static void ingresarArreglo(int s[], int MAX) {
	Scanner entrada = new Scanner(System.in);
	int indice, numero;
	for (indice = 0; indice < MAX; indice++){
		System.out.println("Ingrese dato en casilla" + indice + ":");
		numero = entrada.nextInt();
		s[indice] = numero; //graba en el arreglo
	
	}
}
public static void cargarArreglo(int s[], int limite) {
	
	
}

public static void main(String[] args) {
//creacion del vector
final int MAX = 20; //final sirve para definir una constante
int [] sueldos;
sueldos = new int[MAX];
cargarArreglo(sueldos, MAX); //llamada al metodo ingresar
ordenarArreglo(sueldos, MAX);//llamada al metodo ordenar arreglo
mostrarArreglo(sueldos, MAX);//llamada al metodo para mostrar los dxatos del vector
}

}