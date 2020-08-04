package empresa;

public class GerenteG extends Empleado{
    public GerenteG(String nombresapellidos, double cedula) {
        super(nombresapellidos, cedula);
    }

    public GerenteG(double salario) {
        super(salario);
    }

    public double salarioGerenteG(double viaticosPersonales, int anios){
        double adicional;
        if(anios  == 0){
            return salario;
        }
        else{
            adicional = salario * 0.05;
            salario +=adicional+viaticosPersonales;
            return salario;
        }
        
    }
}
