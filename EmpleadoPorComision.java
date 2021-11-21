
package actividadPoo;


public class EmpleadoPorComision extends Empleado
{
     
private double salarioBase; // salario base por semana

  // constructor con seis argumentos
  public EmpleadoPorComision( String nombre, String apellido,
  String nss, double ventas, double tarifa, double salario )
  {
  super( nombre, apellido, nss, ventas, tarifa );
  setSalarioBase( salario ); // valida y almacena el salario base
  } // fin del constructor de EmpleadoBaseMasComision4 con seis argumentos
 
  // establece el salario base
  public final void setSalarioBase( double salario )
  {
  salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
  } // fin del método establecerSalarioBase
 
  // devuelve el salario base
  public double getSalarioBase()
  {
  return salarioBase;
  } // fin del método obtenerSalarioBase
 
  // calcula los ingresos
@Override
  public double ingresos()
  {
  return getSalarioBase() + super.ingresos();
  } // fin del método ingresos
 
  // devuelve representación String de EmpleadoBaseMasComision4
@Override
  public String toString()
  {
  return String.format( "%s %s\n%s: %.2f", "con sueldo base",
  super.toString(), "sueldo base", getSalarioBase() );
  } // fin del método toString
  } // fin de la clase