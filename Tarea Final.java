/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.primer.parcial;
import java.util.Scanner;
/**
 *
 * @author Mauricio Dominguez
 */
public class FinalPrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
            //Creando el objeto Bicicleta
    Bicicleta bicicleta = new Bicicleta();
    bicicleta.setMarca("Bacini");
    bicicleta.setAño(0);
    bicicleta.setNumero (20);
    bicicleta.setEstado ("M");
    
    System.out.println("Introduce El Año de Fabricacion de la Bicicleta:");			
        bicicleta.año = reader.nextInt();
        
        if (bicicleta.año>=2014) 
            bicicleta.setEstado ("Nueva");
                
else 
bicicleta.setEstado ("Vieja");

System.out.println("Nombre: " + bicicleta.getMarca() );
System.out.println("Año: " + bicicleta.getAño() );
System.out.println("Numero: " + bicicleta.getNumero() );
System.out.println("Estado: " + bicicleta.getEstado() );

}

public static class Bicicleta{
//Private hace que los atributos sean accedidos dentro de la clase
    private String marca;
    private int año;
    private int numero;
    private String estado;   

//Métodos públicos para acceder a los datos
    public String getMarca(){
        return marca;
    }
    public int getAño(){
        return año;
    }
    public int getNumero(){
        return numero;
    }
    public String getEstado(){
        return estado;
    }

    //Métodos públicos para establecer los datos

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAño(int año){
        this.año = año;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setEstado (String estado){
        this.estado = estado;
    }
   }
  }

        
    