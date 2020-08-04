package empresa;

public class Supervisor extends Empleado{
    public Supervisor(String nombresapellidos, double cedula) {
       super(nombresapellidos, cedula);
   }

   public double salarioSupervisor(int anios){
       double adicional;
       if(anios  == 0){
           return salario;
       }
       else{
           adicional = salario * 0.05;
           salario +=adicional;
           return salario;
       }
   }
   //sueldo = basico mas 5% por c/anio en el trabajo

   public Supervisor(double salario) {
       super(salario);
   }
}
