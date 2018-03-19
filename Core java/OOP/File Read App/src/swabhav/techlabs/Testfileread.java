package swabhav.techlabs;

import java.io.FileReader;

public class Testfileread {
public static void main(String args[])throws Exception {
	FileReader file =
		      new FileReader("D:\\cloud reposedry\\Core java\\OOP\\Account Polymorphism\\src\\swabhav\\techlabs\\SavingAccount.java");
		 
		    int i;
		    while ((i=file.read()) != -1)
		      System.out.print((char) i);
	}

}
