package swabhav.tech.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int exitcondition = 1;

		do {
			try {
				System.out.println("1-Start");
				System.out.println("2-Display");
				System.out.println("3-Exit");
				System.out.println("Choose option: ");

				Scanner scan = new Scanner(System.in);
				int choice = scan.nextInt();

				switch (choice) {

				case 1:
					FileReader reader = new FileReader("d:/StateCode.properties");

					Properties p = new Properties();
					p.load(reader);
					HashMap<String, String> map = new HashMap<String, String>();
					map.put("AP", "Andhra Pradesh");
					map.put("AR", "Arunachal Pradesh");
					map.put("AS", "Assam");
					map.put("BR", "Bihar");
					map.put("CG", "Chhattisgarh");
					map.put("GA", "Goa");
					map.put("GJ", "Gujarat");
					map.put("HR", "Haryana");
					map.put("HP", "Himachal Pradesh");
					map.put("JK", "Jammu and Kashmir");
					map.put("JH", "Jharkhand");
					map.put("KA", "Karnataka");
					map.put("KL", "Kerala");
					map.put("MP", "Madhya Pradesh");
					map.put("MH", "Maharashtra");
					map.put("MZ", "Manipur");
					map.put("MG", "Meghalaya");
					map.put("MZ", "Mizoram");
					map.put("NL", "Nagaland");
					map.put("OR", "Orissa");
					map.put("PB", "Punjab");
					map.put("RJ", "Rajasthan");
					map.put("SK", "Sikkim");
					map.put("TN", "Tamil Nadu");
					map.put("TR", "Tripura");
					map.put("UK", "Uttarakhand");
					map.put("UP", "Uttar Pradesh");
					map.put("WB", "West Bengal");
					map.put("TN", "Tamil Nadu");
					map.put("TR", "Tripura");
					map.put("AN", "Andaman and Nicobar Islands");
					map.put("CH", "Chandigarh");
					map.put("DH", "Dadra and Nagar Haveli");
					map.put("DD", "Daman and Diu");
					map.put("DL", "Delhi");
					map.put("LD", "Lakshadweep");
					map.put("PY", "Pondicherry");

					for (Map.Entry m : map.entrySet()) {
						if (((String) m.getKey()).startsWith("A")) {
							System.out.println(m.getKey() + " " + m.getValue());

						}
					}

					break;

				case 2:
					break;
				case 3:

					break;

				}
			} catch (Exception e) {
				System.out.println("Wrong input. Try again.");
				e.printStackTrace();
			}
		} while (exitcondition == 1);
	}

}
