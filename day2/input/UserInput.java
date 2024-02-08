package day2.input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("how to take user input ");

        Scanner sc = new Scanner(System.in);

        // taking integer input
//        System.out.println("pls enter integer value ");
//        int i =sc.nextInt();
//
//        System.out.println("integer" + i);
//
//        // taking bye input
//        System.out.println("pls enter integer value ");
//        int s =sc.nextInt();
//
//        System.out.println("integer" + i);


        System.out.print("enter your name: ");

        String name = sc.nextLine();

        System.out.println("welcome  "+ name + "in delhi");



    }
}
