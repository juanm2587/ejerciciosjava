package guia2_2;

//@author Juan Rivera
import java.util.Scanner;

public class Guia2_2 {

    public static void main(String[] args) {
        /* ----- ejercicio 1-----
        1- Un gerente de una empresa prestadora de servicios de internet necesita un programa que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI
del cliente y el tipo de servicio. Los tipos de servicio son 3:
i.Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
ii.Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
iii.Internet 100 megas (Cuyo valor fijo es de $1600)
El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el
que cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar
y el número de servicio con el que cuenta.
        
        int dni,servi;
        double total=0;
        
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i <5; i++) {
        
        System.out.println("Ingrese su DNI: ");
        dni=sc.nextInt();
        System.out.println("Ingrese el N° de Plan:\n 1- Internet 30 megas\n 2- Internet 50 megas\n 3- Internet 100 megas");
        servi=sc.nextInt();
        
        while (servi!=1 && servi!=2 && servi!=3){
            System.out.println("El Plan '"+servi+"' que ingresaste no existe");
            servi=sc.nextInt();
        }
        if (servi==1){
            total= (890+(890*0.1));            
        }else if (servi==2){
            total= (1050+(890*0.05));            
        }else if (servi==3){
            total= 1600;
        }
        System.out.println("El total a Pagar del Cliente: '"+dni+" 'para el Plan: '"+servi+ "' es: "+total);
        }
        /*
        ----- ejercicio 2----- 
        2- Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto
necesita un programa que, para cada cálculo, permita el ingreso de los dos números por
separado al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe
poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
Por ejemplo:
Número 1 = 25 Número 2 = 15 Operador = +
        
        double a,b,total=0;
        String op;
        total=0;
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor del Primer numero: ");
            a=sc.nextInt();
            System.out.println("Ingrese el valor del Segundo numero: ");
            b=sc.nextInt();
            
            System.out.println("Ingrese un Operador ( +, -, /, *, %)");
            op=sc.next();
            while (!op.equals("+") && !op.equals("-") && !op.equals("/") && !op.equals("*") && !op.equals("%")){
            System.out.println("El Operador '"+op+"' que ingresaste no existe.");
                System.out.println("Vuelva a intentarlo.");
            op=sc.next();
            }
            
            if ("+".equals(op)){
                total=a+b;               
            }else if("-".equals(op)){
                total=a-b;
            }else if("/".equals(op)){
                total=a/b;
            }else if("*".equals(op)){
                total=a*b;
            }else if("%".equals(op)){
                total=a%b;
            }
            System.out.println("El Resultado de: "+a+" "+op+" "+b+" es = "+total);            
        }
        ----- ejercicio 3-----            
        3- En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el
marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el
día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede
llegar a haber. Desde la Federación de Colectividades (Organismo que organiza),
manifestaron que se solicitan los siguientes datos para la inscripción de cada participante:
dni, nombre, apellido y edad.
En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
• Menores A (de 6 a 10 años)
• Menores B (de 11 a 17 años)
• Juveniles (de 18 a 30 años)
• Adultos (de 31 a 50 años)
• Adultos mayores (mayores de 50 años)
Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante,
se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar
el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre
con la palabra “fin”. 
         */
        int edad, dni = 0;
        String nom = "", ape;
        String categoria = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el DNI: ");
            dni = sc.nextInt();
            System.out.println("Ingrese el Nombre: ");
            nom = sc.next();
            if (dni == 0 && nom.equals("fin")) {
                System.out.println("El programa ah finalizado");
            } else {
                System.out.println("Ingrese el Apellido: ");
                ape = sc.next();
                System.out.println("Ingrese la Edad: ");
                edad = sc.nextInt();

                if (edad <= 5) {
                    categoria = "No puede participar";
                } else if (edad >= 6 && edad <= 10) {
                    categoria = "Menores A (de 6 a 10 años)";
                } else if (edad >= 11 && edad <= 17) {
                    categoria = "Menores B (de 11 a 17 años)";
                } else if (edad >= 18 && edad <= 30) {
                    categoria = "Juveniles (de 18 a 30 años)";
                } else if (edad >= 31 && edad <= 50) {
                    categoria = "Adultos (de 31 a 50 años)";
                } else if (edad >= 51) {
                    categoria = "Adultos mayores (mayores de 50 años)";
                }
                System.out.println(nom + " " + ape + " pertenece a la categoria: " + categoria);
            }
        }while(!(dni==0 && nom.equals("fin")));
    
    }
}
