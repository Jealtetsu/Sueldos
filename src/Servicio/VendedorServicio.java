/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class VendedorServicio {
    
    public Vendedor altaVendedor(){
        
        Vendedor v1 = new Vendedor();
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingresar el nombre del vendedor");
        v1.setNombre(leer.next());
        
          System.out.println("Ingresar el DNI");          
        v1.setDni(leer.nextInt());
        
         System.out.println("Ingresar el sueldo basico");
         v1.setSueldoBasico(leer.nextDouble());
         
         System.out.println("Ingrese el dia que comenzo a trabajar ");
         int dia = leer.nextInt();
         
         System.out.println("Ingrese el mes que comenzo a trabajar ");
         int mes = leer.nextInt();
         
         System.out.println("Ingrese el anio que comenzo a trabajar ");
         int anio = leer.nextInt();
         
         Date fecha = new Date (anio-1900, mes-1,dia);
         v1.setFechaDeInicio(fecha);
         
//         LocalDate Fecha1 = LocalDate.of(dia, Month.MARCH, dia);
//             v1.setFechaDeInicio(fecha);
             
           return v1;
        
    }
    
    public void SueldoMensual (Vendedor v1){
         Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldomensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es : " + v1.getNombre()+
       " es de $ " +v1.getSueldomensual());
        
    }
    public void Vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaDeInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresnponden 14 dias de vaciones");

        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias");

        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }

}
