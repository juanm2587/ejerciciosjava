/* 1) Vectores
Resolver los siguientes ejercicios. Intentar ejecutarlos y probarlos con datos de prueba.
a. Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra,
Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del
vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.
b. Realizar un programa que permita la carga de 10 números en un vector. Una vez cargados,
se necesita que el programa determine cual es el mayor y cuál es el menor de ellos.
c. Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados,
se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el
número 3.
d. Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esto,
necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos
y el promedio de sueldo que tuvo en el año.
e. En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas
de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los nombres de
las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las
temperaturas máximas alcanzadas en la última semana. Se necesita un programa que
permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá
poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la
temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
 */
package guia3_1;

// @author Juan Manuel Rivera
import java.util.Scanner;

public class Guia3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ----- Ejercicio A -----
        String nombres[] = new String[7];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Guardando los nombres ingresados: " + i);
            nombres[i] = sc.next();
        }
        for (String i : nombres) {
            System.out.println("los nombres ingresados son: " + i);
        
        ----- Ejercicio B -----
        int numero;
        int num[]=new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese el numero que quiere guardar en la picision: "+i);
            numero=sc.nextInt();  
            num[i]=numero;
        }
        int mayor=-999;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>mayor){
                mayor=num[i];
            }            
        }
        int menor=999;
        for (int i = 0; i < num.length; i++) {
            if(num[i]<menor){
                menor=num[i];
            }            
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        
        ----- Ejercicio C -----
        c. Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados,
se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el
número 3.
        }*/
        int numero;
        int num[]=new int[4];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese el numero que quiere guardar en la picision: "+i);
            numero=sc.nextInt();  
            num[i]=numero;
        }
        
        
        
        
    }
}
