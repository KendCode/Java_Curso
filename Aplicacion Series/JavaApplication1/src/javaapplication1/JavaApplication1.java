/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author PC-1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int n, par=2, i;
        System.out.println("Ingrese el tamaño de la serie: ");
        n = leer.nextInt();
        
        for(i =1; i<=n;i++)
        {
            System.out.print(par+", " );
            par += 2;
        }
               
               
               
    }
    
}
