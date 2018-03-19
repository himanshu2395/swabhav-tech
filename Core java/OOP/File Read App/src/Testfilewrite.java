import java.io.FileWriter;

public class Testfilewrite {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter(
					"D:\\cloud reposedry\\Core java\\OOP\\Account Polymorphism\\src\\swabhav\\techlabs\\SavingAccount.java");
			fw.write("Welcome to javaTpoint.");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}

}
