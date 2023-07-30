//Declare the size of an array and input elements of this array. Then search an element of this array
package javaArrays;

import java.util.Scanner;

public class scarchingElements {
    public static void main(String[] args) {
        int[] marks= new int[5];
        int i=1;
        Scanner obj= new Scanner(System.in);
        int search= obj.nextInt();
        System.out.println("Enter 4 numbers:");
        //Input
        for (i=1;i<marks.length;i++){
            System.out.print("Enter number "+i+":");
            marks[i]= obj.nextInt();
        }
        //Output
        for (i=0;i<marks.length;i++){
//            System.out.println("Number of "+i+"is: "+marks[i]);

            if (marks[i]==search){
                System.out.println("Element found at the position of "+i);
            }
        }
//        checking number of user input
//        for (i=0;i<marks.length;i++){
//            System.out.println("Enter the number which you want to search:");
//
//
//        }
    }
}
