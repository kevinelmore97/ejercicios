package empresa;
public class Oficinista extends Empleado{
    private int numeroDeIdentificacion;
   private int codigoArea;

   public Oficinista(int numeroDeIdentificacion, int codigoArea, String nombresapellidos, double cedula) {
       super(nombresapellidos, cedula);
       this.numeroDeIdentificacion = numeroDeIdentificacion;
       this.codigoArea = codigoArea;
   }

   public Oficinista(double salario) {
       super(salario);
       
   }
   

   public double salarioOficionista(){
       return salario;
   }
}