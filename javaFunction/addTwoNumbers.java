//This is a program to add two numbers and return the sum using functions

package javaFunction;

import java.util.Scanner;


public class addTwoNumbers {
    //make a function for calculate sum of two numbers...
    public static int calculateSum(int a, int b){
        int sum= a+b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner obj= new Scanner(System.in);
        int a= obj.nextInt();
        int b= obj.nextInt();

        int sum= calculateSum(a, b);
        System.out.println("Sum of two number is:"+sum);
    }
}
