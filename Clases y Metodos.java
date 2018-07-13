/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.y.metodos;
import java.util.Scanner;

/**
 *
 * @author Mauricio Dominguez
 */
public class ClasesYMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println(
            "SOY EL MEJOR PROGRAMADOR " 
                );
                
        //Segundo Metodo
        
        int numero1 = 0;
        
        System.out.println("Introduce la Nota Final del Alumno:");			
        numero1 = reader.nextInt();
        
        if (numero1>=70) System.out.println(
            "Aprobado " 
                );
else 
System.out.println(
            "Reprobado " 
                );

         //Tercer Metodo
         
         int num1 = 8;
        int num2 = 10;
        
        int suma=0;
        
        String mensaje = "El total de la Suma es: ";
        
        suma= num1+num2;
        
        System.out.println(mensaje+suma);
                
        
        //Cuarto Metodo
        
       
        
        int numx = 0;
int num = 1;
 
System.out.println("Introduce el numero maximo de la lista:");			
numx = reader.nextInt();

for (int i = 1; i <= numx; i++) {
            System.out.println(
                "No." + i
            );
        }
 

//Quinto Metodo

double n1=0;
double n2=0;
double n3=0;
double resta=0;
double multi=0;

System.out.println("Introduce el numero 1:");			
n1 = reader.nextDouble();

System.out.println("Introduce el numero 2:");			
n2 = reader.nextDouble();

System.out.println("Introduce el numero 3:");			
n3 = reader.nextDouble();

resta=n1-n2-n3;
multi=n1*n2*n3;

 System.out.println("El total de La Resta es: "+resta);
 
 System.out.println("El total de La Multiplicacion es: "+multi);

        // TODO code application logic here
    }
    
}
