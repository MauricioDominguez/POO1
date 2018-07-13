/**
 * @(#)programa1.java
 *
 * programa1 application
 *
 * @author 
 * @version 1.00 2015/1/24
 */
 import java.util.*;
public class programa1 {
    
    public static void main(String[] args) {
    double suma=0;
    double num1,num2;
    
    Scanner n=new Scanner(System.in);
    
    System.out.println("ingrese el primer numero: ");
    	num1=n.nextDouble();
    	
    System.out.println("ingrese el segundo numero: ");
    num2=n.nextDouble();
    
    suma=num1+num2;
    
    System.out.println("la suma es: "+suma);
    	
    }
}
