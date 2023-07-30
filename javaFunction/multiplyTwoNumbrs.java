//This is a program to multiply two numbers and return the product using functions

package javaFunction;

import java.util.Scanner;

public class multiplyTwoNumbrs {
    public static int multiplication(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner obj= new Scanner(System.in);
        int a= obj.nextInt();
        int b= obj.nextInt();
        int product= multiplication(a, b);
        System.out.println("product of "+a+ "and "+b+ " is: "+ product);
    }
}
