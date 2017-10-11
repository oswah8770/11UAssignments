/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 * calculate total cost of expenses and how many tickets you need to sell
 * @author oswah8770
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners
        Scanner promCost = new Scanner(System.in);
        Scanner djCost = new Scanner(System.in);
        Scanner hallCost = new Scanner(System.in);
        Scanner decorCost = new Scanner(System.in);
        Scanner staffCost = new Scanner(System.in);
        Scanner miscCost = new Scanner(System.in);
        
        // ask for the costs and create input variables
        System.out.println("How much does the food for prom cost?");
        int prom = promCost.nextInt();
        
        System.out.println("How much does the DJ cost?");
        int dj = djCost.nextInt();
        
        System.out.println("How much does it cost to rent the hall");
        int hall = hallCost.nextInt();
        
        System.out.println("How much does decorations cost?");
        int decor = decorCost.nextInt();
        
        System.out.println("How much does it cost for staff?");
        int staff = staffCost.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        int misc = miscCost.nextInt();
        
        
        // calculate total cost and number of tickets required
        int totalCost = prom + dj + hall + decor + staff + misc;
        
        int totalTickets = (int)Math.ceil(totalCost / 35.0);
        
        // out put total cost and tickets needed
        System.out.println("The total cost is $" + totalCost + ". You will need to sell " + totalTickets + " tickets to break even");
        
        
        
    }
}
