package p1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

    	//String input = "san";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {


            reversed += str.charAt(i);// reversed = reversed + input.charAt(i);	        
            }

        System.out.println("The reversed string is: " + reversed);
    }

}
