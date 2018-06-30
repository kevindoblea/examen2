/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author turupawn
 */
public class Ejercicios {
    static void guardar(String nombre_archivo, ArrayList<Producto> productos)
    {
        try
        {
            PrintWriter p1 = new PrintWriter(nombre_archivo);

            for(Producto produc : productos)
            {
                p1.println(produc.nombre + " " + produc.categoria+" "+ produc.existencias + " " + produc.precio);
            }

            p1.close();
        }catch (Exception e)
        {
            System.out.println("Ocurrio un error al guardar.");
        }
    }
    
    static ArrayList<Producto> abrir(String nombre_archivo)
    {
        ArrayList<Producto> abre= new ArrayList<>(); 
        try
        {
            Scanner scanner = new Scanner(new File(nombre_archivo));
            while(scanner.hasNextLine())
            {
                String nombre = scanner.next();
                String categoria = scanner.next();
                int existencias = scanner.nextInt();
                double precio = scanner.nextDouble();
                
                abre.add (new Producto (nombre, categoria, existencias, precio) );
            }
            scanner.close();
        }catch(Exception e)
        {
            
        }
        return abre;
       
    }
}
