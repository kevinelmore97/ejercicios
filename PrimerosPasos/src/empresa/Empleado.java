package empresa;

public class Empleado {
	     protected double salario;
	    protected String nombresapellidos;
	    protected double cedula;

	    public Empleado(String nombresapellidos, double cedula) {
	        //this.salario = salario;
	        this.nombresapellidos = nombresapellidos;
	        this.cedula = cedula;
	    }
	    
	    public Empleado(double salario){
	        this.salario = salario;
	    }

	    
	    public void setNombresYapellidos(String nombresapellidos) {
	        this.nombresapellidos = nombresapellidos;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public void setCedula(double cedula) {
	        this.cedula = cedula;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public String getNombresYapellidos() {
	        return nombresapellidos;
	    }

	    public double getCedula() {
	        return cedula;
	    }

	    
	    
	}

