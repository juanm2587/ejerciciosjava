/* 2) Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se
trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo
de esta realiza los siguientes controles:
a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se
permiten compras inferiores a 5 productos.
b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un
mensaje que el costo de envío es de $200.
c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje
de que el envío es gratuito.
Realizar el programa necesario para llevar a cabo los 3 controles citados.
 */
package merceria;

import java.util.Scanner;

public class Merceria {

    public static void main(String[] args) {
        int canu,mosta,total;
       
        
        Scanner teclado=new   Scanner(System.in);
        System.out.println("Ingrese la cantidad de Canutillos ");
        canu=teclado.nextInt();
        
        System.out.println("Ingrese la cantidad de Mostacillas ");
        mosta=teclado.nextInt();
       
        total=canu+mosta;
        
        if (total<5){
            System.out.println("No permiten compras inferiores a 5 productos.");            
        }else if (total>=5 && total<=15){
            System.out.println("El costo de envío es de $200");       
        }else if (total>=15){
            System.out.println("El envío es gratuito.");
        }
        
    }
    
}
