package com.techlabs.array;
import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		 int large=0; 
	        int num;

	        System.out.println("enter the number");

	        Scanner src=new Scanner(System.in);

	        int n=src.nextInt();

	        for(int i=0;i<n;i++)
	        {
	          num=src.nextInt();
	          if(num>large)
	          {
	           large=num;
	          }
	          System.out.println("the largest is:"+large);

	}

}
}
