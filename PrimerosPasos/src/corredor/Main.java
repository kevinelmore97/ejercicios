package corredor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Corredor e1 = new Corredor();
        int correr,recarga;
        String opc = null;
        
        
       System.out.print("Digite la energia del corredor: ");
       e1.setEnergia(in.nextInt());
       do{
           System.out.println("\nDigite la cantidad de veces que correra el deportista : ");
           correr = in.nextInt();
            
       
            System.out.println("\nEl competidor comienza a correr...");
            
            for(int i=0;i<correr;i++){
                    e1.correr();
                    e1.MedirEnergia();
            }
            
            System.out.print("\n La energia del corredor es: "+e1.getEnergia()); 
            
            
            if(e1.getEnergia() == 0){
                System.out.println();
                e1.energiaCero();
                System.out.println("\nRecargando energia...");
                System.out.println("Indique cuantas veces entrenara el deportista : "); recarga = in.nextInt();
                for(int i=0;i<recarga;i++){
                    e1.recargarEnergia(10);
                    e1.entrenar();
                }
                System.out.print("\nLa energia del corredor es: "+e1.getEnergia());
            }
           
            else{
                System.out.println("\nRecargando energia...");
                System.out.println("Indique cuantas veces quiere que el competidor entrene: "); recarga = in.nextInt();
                for(int i=0;i<recarga;i++){
                    e1.recargarEnergia(10);
                    e1.entrenar();
                }
                System.out.print("\nLa energia del corredor es: "+e1.getEnergia());
            }
            
            System.out.println("\n\nQuiere que el competidor vuelva a correr? (S/N)");
            opc = in.next();
            System.out.println("\n\n");
        }while("s".equals(opc) || "S".equals(opc) || "si".equals(opc) || "SI".equals(opc) || "Si".equals(opc));    
        
       
        
    }
    
}

