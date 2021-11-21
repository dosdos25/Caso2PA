/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadPoo;


public class principal {
    public static void main( String args[] ) {
  // crea instancia de un objeto EmpleadoBaseMasComision4
 EmpleadoPorComision empleado = new EmpleadoPorComision (
         "Cristian", "Allauca", "345-35-3241", 5000, .04, 300 );
 
  // obtiene datos del empleado por comisión con sueldo base
  System.out.println(
  "Informacion del empleado obtenida por los metodos establecer: \n" );
  System.out.printf( "%s %s\n", "El primer nombre es",
            empleado.getPrimerNombre() );
  System.out.printf( "%s %s\n", "El apellido es",
            empleado.getApellidoPaterno() );
  System.out.printf( "%s %s\n", "El numero de seguro social es",
             empleado.getNumeroSeguroSocial() );
  System.out.printf( "%s %.2f\n", "Las ventas brutas son",
             empleado.getVentasBrutas() );
   System.out.printf( "%s %.2f\n", "La tarifa de comision es",
             empleado.getTarifaComision() );
  System.out.printf( "%s %.2f\n", "El salario base es",
             empleado.getSalarioBase() );
 
             empleado.setSalarioBase( 1000 ); // establece el salario base
 
  System.out.printf( "\n%s:\n\n%s\n",
  "Informacion actualizada del empleado, obtenida por toString",
              empleado.toString() );
    
}
}
