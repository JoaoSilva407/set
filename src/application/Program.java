package application;

import entities.Students;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Joao
 */
public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Set<Students> set = new HashSet<>();
        
        System.out.print("How many students for course A? ");
        int num1 = input.nextInt();        
               
        for(int j=0; j<num1; j++) {
            int number = input.nextInt();
            set.add(new Students(number));
        }
        
        System.out.print("How many students for course B? ");
        int num2 = input.nextInt();
        
        for(int j=0; j<num2; j++) {
            int number = input.nextInt();
            set.add(new Students(number));
        }
        
        System.out.print("How many students for course C? ");
        int num3 = input.nextInt();
        
        for(int j=0; j<num3; j++) {
            int number = input.nextInt();
            set.add(new Students(number));
        }
        
        System.out.println("Total students: " + set.size());
        
        input.close();
    }
    
}
