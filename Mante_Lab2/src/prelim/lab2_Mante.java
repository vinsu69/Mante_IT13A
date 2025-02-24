
package prelim;

import java.util.Scanner;
public class lab2_Mante {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter first number: ");
        int cat1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int dog2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int milo3 = scanner.nextInt();
        
       
        int greatest = Math.max(cat1, Math.max(dog2, milo3));
        
        
        System.out.println("The greatest number is: " + greatest);
        
        scanner.close();
    }
}

