/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int x=0;
        x= kb.nextInt();
	    int result= (x/350)+1;
	    System.out.println("You will need to purchase "+result+" gallons of paint to cover "+x+" square feet.");
    }
}
