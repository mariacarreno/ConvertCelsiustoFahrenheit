/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertcelsiustofahrenheit;

/**
 *
 * @author Carreño Maria Rosa
 */
import java.util.Scanner;
public class ConvertCelsiustoFahrenheit {

    public static void main(String[] args) {
        double tempf, tempc;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a temperature in degrees Celsius ");
        tempc = keyboard.nextDouble();
        
        tempf = 9.0/5.0 * tempc + 32.0;
        
        System.out.println("The temperature in Fahrenheit is " + tempf);
    }
    
}
