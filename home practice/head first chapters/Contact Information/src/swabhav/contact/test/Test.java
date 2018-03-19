package swabhav.contact.test;
import java.util.Scanner;
import java.util.Arrays;


public class Test {
	
	    public static void main(String[] args) {
	        int[] values = new int[3];  
	        Scanner input = new Scanner(System.in);
	        //to enter values in array
	        System.out.println("Enter the values in array");
	        for (int i = 0;i<values.length ; i++) {
	            values[i] = input.nextInt();
	        }
	        input.close();
	        System.out.println("values in array");
	        //first method of printing the values of array
	        System.out.println("From the first method of printing array");
	        for (int j: values) {
	            System.out.println(j);
	        }
	        //second method of printing the values of array
	        System.out.println("From the second method of printing array");
	        for (int n = 0;n<values.length ;n++ ) {
	            System.out.println(values[n]);
	        }
	        // third method of printing value of an array
	        System.out.println("From the third method of printing array");
	        System.out.println(Arrays.toString(values));
	    }
	}