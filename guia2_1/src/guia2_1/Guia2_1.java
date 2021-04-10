/* 1-Realizar un programa que muestre en pantallalos numeros del 1 al 35 (uno bajo el otro) 
Utilizar para esto una estructura repetitiva.
2- Realizar un programa que dado por teclado un limite numerico (por ejemplo 100)
muestre en pantalla todos los numeros hasta ese limite (empezando por 1)
3- Realizar un programa que muestre por pantalla los numeros del 200 al 250 salteando de 2 en dos.
Ejemplo : 200, 202, 204... etc.
4-Realizar un programa que lleve acabo la cuenta regresiva para el año nuevo. La cuenta debe 
empezar en 10 y terminar en 1.
5- Realizar un programa que muestre en pantalla palabras que sean  ingresadas por teclado hasta
que se ingrese la palabra "salir".
*/
package guia2_1;

//@author Juan Rivera

import java.util.Scanner;

 
public class Guia2_1 {

    
    public static void main(String[] args) {
        /*
        ----- ejercicio 1-----
        int x=1;
        while (x<=35){
            System.out.println(x);
            x++;
        }  
        
        ----- ejercicio 2-----
        int a,b;
        a=1;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el limite: ");        
        b=sc.nextInt();
        
        while (a<=b){
            System.out.println(a);
            a++;
        }
        
        ----- ejercicio 3-----
        int b,c;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el limite inicial: ");        
        b=sc.nextInt();
        System.out.println("Ingrese el limite final: ");        
        c=sc.nextInt();
        
        while (b<=c){
            System.out.println(b);
            b+=2;
        }
        
        ----- ejercicio 4-----  
        int b,c;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el limite inicial: ");        
        b=sc.nextInt();
        System.out.println("Ingrese el limite final: ");        
        c=sc.nextInt();
        
        while (b>=c){
            System.out.println(b);
            b--;
        }
        
        ----- ejercicio 5----- 
        */
        String palabra1,palabra2;
                        
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese palabra secreta");
        palabra1=sc.next();
        
        System.out.println("Descifrar palabra secreta");
        palabra2=sc.next();
        
        while (!palabra2.equals(palabra1)){
            System.out.println("La palabra: '"+palabra2+"' es incorrecta.\n Ingrese otra palabra:");
            palabra2=sc.next();
        }        
        System.out.println("La palabra '"+palabra2+"' es correcta.");          
    }
    
}
