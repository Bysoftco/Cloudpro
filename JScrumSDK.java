//SDK Java
//V.2 Product Owner importar la Libreria Scanner, Capturar Datos por Teclado y actualizar
//V.3 Scrum Team : Importar:import javax.swing.JOptionPane; Capturar Datos de entrada y actualizar
import java.util.Scanner;

public class JScrumSDK {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        
        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();

       //Valentina Perez 4755553
        System.out.print("Ingresar tu RH: ");
        String RH = sc.nextLine();
        
         // Maria Elsa Nossa Muñoz-1118366043
        System.out.print("Ingresa tu peso: ");
        String peso = sc.nextLine();
        
        System.out.print("Ingresa tu rol: ");
        
        String rol = sc.nextLine();
        // Samuel Castillo Benavides 1023371624
        System.out.print("Ingresa tu genero: ");
        String genero = sc.nextLine(); 
        // Sara Ramos Arango CC 1034399881
        System.out.print("Ingresa tu salario: ");
        double salario = sc.nextDouble(); 
        sc.nextLine(); 
        // Jose Manuel Hurtado 1072642819
        System.out.print("Ingresa tu estado civil: ");
        
        String Civil = sc.nextLine();
        
        
        System.out.println("Soy el " + rol + " de Cloudpro, Mi nombre es: " + name + ", Mi edad es: " + edad + ", Mi genero es: " + genero + " y mi salario es: " + salario+ ", Mi rh es: " +RH+ ", Mi peso es: " +peso+ ",  Mi estado civil es: "+civil);
        
        sc.close();
    }
}
