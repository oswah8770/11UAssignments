/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;
import java.util.Scanner;
/**
 * create a method that returns the area of the circle (double)
 * @author Hunter Oswald
 */
public class A7Q1 {

    // creates a method that returns area of the circle
    public double areaOfCirc(double radius) {
        double area = 3.14 * (Math.pow(radius, 2));
        return area;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run methods
        A7Q1 run = new A7Q1();
        
        // create a scanner
        Scanner input = new Scanner(System.in);       
        
        // ask for the radius
        System.out.println("Please enter the radius of the circle");
        
        double radius = input.nextDouble();
        
        // output the area of the circle
        double areaC = run.areaOfCirc(radius);
        
        System.out.println("The area of the circle is " + areaC);
        
    }
}
