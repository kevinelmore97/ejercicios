package emisoraderadio;

import java.util.Scanner;

public class Main {


	    
	    public static void main(String[] args) {
	        RadioFM ob1 = new RadioFM();
	        ob1.setMHz(80);
	        @SuppressWarnings("resource")
			Scanner in = new Scanner (System.in);
	        int opc;
	        do{
	            System.out.println("1) Subir MHz");
	            System.out.println("2) Bajar Mhz");
	            System.out.println("3) Mostrar MHz");
	            System.out.println("4) Salir");
	            System.out.print("\n Digite una opcion a realizar: ");opc = in.nextInt();
	            switch(opc){
	                case 1: System.out.println("\nLa frecuencia subira en 0.5"); ob1.up(); ob1.revisor(); break;
	                case 2: System.out.println("\nLa frecuencia bajara en 0.5");ob1.down(); ob1.revisor(); break;
	                case 3: System.out.println("\nLa frecuencia actual es de: "+ob1.visualizador()); break;
	                case 4: break;
	                default : System.out.println("Opcion no reconocida, intente nuevamente.");
	            }
	            
	        }while(opc != 4);
	    }
	    
	}

