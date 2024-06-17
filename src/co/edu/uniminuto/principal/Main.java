/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.principal;

import co.edu.uniminuto.entidades.Clientes;
import co.edu.uniminuto.entidades.Productos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Calcular el valor a pagar de un cliente por su compra, se desea 
 * saber los productos que ha comprado: precio, cantidad, descripción.
 * También el total a pagar y cálculo de impuestos,adicional se debe tener el 
 * nombre, apellidos y documento del cliente.*/
 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellidos;
        String documento;
        Double precio;
        int cantidad;
        String descripcion;
        boolean noMasProductos = true;
        String decision;
        // Obtener datos del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente: ");
        apellidos = scanner.nextLine();
        System.out.print("Ingrese el documento del cliente: ");
        documento = scanner.nextLine();
        // Instanciamos el objeto de tipo cliente
       Clientes cliente = new Clientes(nombre,apellidos,documento);
       //los productos
       List<Productos> producto = new ArrayList<>();
        System.out.println("");
        System.out.println(" Ingrese el precio ");
        precio = scanner.nextDouble();
        System.out.println(" Ingrese la cantidad");
        cantidad = scanner.nextInt();
        System.out.println(" ingrese la descripcion");
        descripcion = scanner.nextLine();
        
        while (noMasProductos){
            System.out.println(" Ingrese el precio ");
            precio = scanner.nextDouble();
            System.out.println(" Ingrese la cantidad");
            cantidad = scanner.nextInt();
            System.out.println(" ingrese la descripcion");
            descripcion = scanner.nextLine();
            producto.add(new Productos(precio,cantidad,descripcion));
            System.out.println("escribe mas si quieres agregar productos");
            System.out.println("escribe salir si no deseas agregar productos");
            decision = scanner.nextLine();
            if(decision.equalsIgnoreCase("salir")) noMasProductos = false;
            
        }
        System.out.println("nombre del cliente "+ cliente.getNombre());
        System.out.println("apellido del cliente "+ cliente.getApellidos());
        System.out.println("documento cliente "+ cliente.getDocumento());
        
        for (Productos producto1 : producto) {
        }
        
        
        
       
        }
    }

            
            

           
    


   
    


        
        
        
      
       
    
    

