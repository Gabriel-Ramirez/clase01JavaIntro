/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class HolaMundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                //Tipos de variables 
        // 11111111 bits = byte 
        byte variableAlgo; // 8 bits -128 127 
        short numero; //16 bits -32768 32767
        int enteros;//32 bits  -2^31 (2^31)-1
        long tipoLong; // 64 bits -2^63 (2^63)-1
        
        // 8.32643732132131232
        float tipoFloat; // con decimales con 32 bits de presicion 
        double tipoDouble; // con decimales con 64 bits de presicion 
        
        
        char caracter; 
        boolean tf; // true false 

        String cadenas;
        
        int numero1, numero2, suma; 
        
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")); 
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero")); 
        
        suma = numero1+numero2;
        
//        System.out.println("Ingrese un numero");
//        
//        Scanner sc = new Scanner(System.in); 
//        
//        mensaje = sc.nextLine(); 
//        
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
//        
    }
    
}
