package swabhav.techlabs.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Csv {

	public static void genetrateCsvFile(String fileName) {

		FileWriter writer = null;

		String s = "First Name";
		char b = (',');
		String a = "Last Name";
		long mobileno = 0;

		try {
			writer = new FileWriter(fileName);
			BufferedWriter bufferwriter = new BufferedWriter(writer);
			// writer.append("Name");
			// writer.append(',');
			// writer.append("Number");
			// writer.append('\n');
			bufferwriter.write("rahul");
			bufferwriter.write(',');
			bufferwriter.append("kumar");
			bufferwriter.write(',');
			bufferwriter.write("56345678765");

			bufferwriter.newLine();

			// writer.append("manish");
			// writer.append(',');
			// writer.append("001");
			// writer.append('\n');
			bufferwriter.write("manish");
			bufferwriter.write(',');
			bufferwriter.write("sharma");
			bufferwriter.write(',');

			bufferwriter.write("53345675654");
			bufferwriter.newLine();

			// writer.append("raj");
			// writer.append(',');
			// writer.append("001");
			// writer.append('\n');

			bufferwriter.flush();

			System.out.println("CSV file is created ");
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		String location = "D:\\Test.csv";
		genetrateCsvFile(location);

	}

}
