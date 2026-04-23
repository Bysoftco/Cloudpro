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
        
        System.out.print("Ingresa tu rol: ");
        String rol = sc.nextLine();
        
        System.out.println("Soy el "+rol+" de Cloudpro, Mi nombre es: "+name+" mi edad es: "+edad);
        
        sc.close();
    }
}
