package programacion;

public class Positivos {

	int i=0;
	while(i<5) {
		//i++;
		System.out.println("Leer n�mero (" + i + "): ");
        int numero = in.nextInt();
        if(numero>0)
        	System.out.println("N�mero: " + numero);
        i++;
	}
	
	/*
	for(int i=0;i<5;i++) {
		System.out.println("Leer n�mero (" + i + "): ");
        int numero = in.nextInt();
        if(numero>0)
        	System.out.println("N�mero: " + numero);
	}
	*/
	
	
	
	/*
	int promedio = 100;
	int contador = 10;
	
	if(promedio >= 70) {
		
		contador = 90;
		if(promedio <= 90) {
			contador = 100;
		}
	}
	System.out.println(contador);
	*/
	
}




