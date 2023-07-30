//Find the factorial of any number using function

package javaFunction;

import java.util.Scanner;

public class findFactorial {
    //Make a function for make factorial....
    public static int  factorial(int num) {
        if (num < 0) {
            System.out.println("Invalid number");
            return (0);
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            //System.out.println(fact);
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner obj= new Scanner(System.in);
        int fact= obj.nextInt();
        System.out.println("The factorial of "+ fact + " is "+factorial(fact));//function colling
        //factorial(fact);
    }
}
