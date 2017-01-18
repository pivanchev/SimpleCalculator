/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        
        
        while(true){
            System.out.println("Enter a command:(sum,difference,quit)!");
            String command=input.nextLine();
            
            
            if(command.equals("quit")){
                break;
            }
                System.out.println("Enter the numbers!");
                int first=input.nextInt();
                
                int second=input.nextInt();
                
                
            if(command.equals("sum")){
            
            int sum= first + second;
                System.out.println("The sum is " + " " + sum);
                break;

            }else if(command.equals("difference")){
                int difference=first-second;
                System.out.println("The difference is" + " " + difference);
                break;
   
            }
    }
            System.out.println("Thanks and bye!");
        // TODO code application logic here
    }
    
}
