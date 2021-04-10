 // @author Juan Rivera
/* Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los
mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, calcule y
muestre en pantalla el correspondiente sueldo. 
*/
package variables;

import java.util.Scanner;


public class Variables {  
          
    public static void main(String[] args) {
        double sueldo=0;
        int categoria;
        
        System.out.println("Ingrese la categoria ");
        Scanner teclado=new Scanner(System.in);
        categoria= teclado.nextInt();
        
        if (categoria==1){
            sueldo=15890+(15890*0.1);
        }
        else{
            if (categoria==2){
                sueldo=25630.89;
            }
            else{
                if (categoria==3){
                    sueldo=35560.20-(35560.20*0.11);
                }else{
                    System.out.println(categoria+" no es una categoria valida ");
                }
            }
        }
        if (categoria==1 || categoria==2 || categoria==3){
            System.out.println("el total de la categoria es "+categoria+ " es igual a "+sueldo);        
        }
    }    
}
