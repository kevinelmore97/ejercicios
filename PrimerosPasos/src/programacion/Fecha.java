package programacion;

import java.util.Scanner;

public class Fecha {
	 int año;
	    int mes;
	    int dia;
	    
	    
	public Fecha(int año, int mes, int dia){
	    this.año = año;
	    this.mes = mes;
	    this.dia = dia;    
	    }
	    
	public Fecha(){
	    this(0, 0, 0);
	    }
	    
	public void  Reiniciar(int d, int m, int a){
	    this.año = a;
	    this.mes = m;
	    this.dia = d;      
	    }
	    
	public void Adelantar(int d, int m, int a){
	    if(d == dia){
	        if(m == mes){
	            if (a == año){
	                System.out.println("la fecha se encontro");
	                this.Imprimir();
	            }else{
	                System.out.println("no se encontro el año");
	            }
	        }else{
	            System.out.println("no se encontro el mes");     
	        }
	    }else{
	        System.out.println("nose encontro el dia");
	    }
	}

	public void Imprimir(){
	    System.out.println("año " + this.año  + " mes " + this.mes  + " dia " + this.dia); 
	}

	public int dia(int mes){
	    int nuDia=0;
	    if(mes==4 || mes ==6 || mes==9 || mes==1){
	        nuDia=30;
	    }else if (mes==1 || mes ==3 || mes==5 || mes==8 || mes==10 || mes==12){
	        nuDia=31;
	    }else if (mes==2){
	        nuDia=28;
	    }
	    
	    return nuDia;
	}
	public boolean Normalizar(){
	    boolean norma=true;
	    if (this.año<1 || (this.mes>1 && this.mes>12)|| this.dia> dia(mes)){
	        System.out.println("Los datos estan fuera de litime");
	        norma=false;
	    }else norma=true;
	    return norma;
	}
	public static void main(String[] args){
	    Scanner entrada = new Scanner(System.in);
	    Fecha fecha = new Fecha();
	    System.out.println("menú fecha");
	    System.out.println("ingrese una fecha: ");
	    System.out.println("ingrese dia: ");
	    int dia = entrada.nextInt();
	    System.out.println("ingrese mes: ");
	    int mes = entrada.nextInt();
	    System.out.println("ingrese año: ");
	    int año = entrada.nextInt();
	    fecha.Reiniciar(dia, mes, año);
	    fecha.Imprimir();
	    fecha.Normalizar();
	    if(fecha.Normalizar()==true){
	        fecha.Imprimir();
	    }
	    
	    System.out.println("ingrese otra1 fecha: ");
	    dia = entrada.nextInt();
	    System.out.println("ingrese el mes: ");
	    mes = entrada.nextInt();
	    System.out.println("ingrese año: ");
	    año = entrada.nextInt();
	    fecha.Adelantar(dia, mes, año);
	    }
	}

