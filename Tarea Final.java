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
    bicicleta.setA�o(0);
    bicicleta.setNumero (20);
    bicicleta.setEstado ("M");
    
    System.out.println("Introduce El A�o de Fabricacion de la Bicicleta:");			
        bicicleta.a�o = reader.nextInt();
        
        if (bicicleta.a�o>=2014) 
            bicicleta.setEstado ("Nueva");
                
else 
bicicleta.setEstado ("Vieja");

System.out.println("Nombre: " + bicicleta.getMarca() );
System.out.println("A�o: " + bicicleta.getA�o() );
System.out.println("Numero: " + bicicleta.getNumero() );
System.out.println("Estado: " + bicicleta.getEstado() );

}

public static class Bicicleta{
//Private hace que los atributos sean accedidos dentro de la clase
    private String marca;
    private int a�o;
    private int numero;
    private String estado;   

//M�todos p�blicos para acceder a los datos
    public String getMarca(){
        return marca;
    }
    public int getA�o(){
        return a�o;
    }
    public int getNumero(){
        return numero;
    }
    public String getEstado(){
        return estado;
    }

    //M�todos p�blicos para establecer los datos

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setA�o(int a�o){
        this.a�o = a�o;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setEstado (String estado){
        this.estado = estado;
    }
   }
  }

        
    