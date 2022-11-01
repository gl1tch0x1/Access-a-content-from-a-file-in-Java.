package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //String programs = new String();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of a program: \nA. Html \nB. Bash \nC. Java  \nD. Python \n");
        String str= sc.nextLine();
        switch(str) {
            case "A":
//                 programs = "A";
                System.out.println("You have selected  html");
                break;
            case "B":
                //programs = "B";
                System.out.println("You have selected Bash");
                break;
            case "C":
                //programs = "C";
                System.out.println("You have selected Java");
                break;
            case "D":
                //programs = "D";
                System.out.println("You have selected python");
                break;
            default:
                System.out.println("Please select the valid character");
        }
    }
}
