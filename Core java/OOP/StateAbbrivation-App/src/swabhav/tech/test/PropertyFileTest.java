package swabhav.tech.test;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class PropertyFileTest {

	public static void main(String[] args) {
		int exitcondition = 1;

		do {
			try {
				System.out.println("1-Search RTO");
				System.out.println("2-Display");
				System.out.println("3-Exit");
				System.out.println("Choose option: ");

				Scanner scan = new Scanner(System.in);
				int choice = scan.nextInt();
				FileReader reader = new FileReader("d:/StateCode.properties");

				switch (choice) {

				case 1:

					Properties p = new Properties();
					p.load(reader);
					String name = scan.next();
					for (Map.Entry m : p.entrySet()) {
						if (m.getKey().toString().contains(name)) {
							System.out.println(m.getKey() + " " + m.getValue());

						}
					}

					break;

				case 2:
					HashMap<String, String> map = new HashMap<String, String>();
					map.entrySet();
					Properties a = new Properties();
					a.load(reader);
					String abrevation = scan.next();
					for (Map.Entry m : a.entrySet()) {
						if (m.getValue().toString().toLowerCase().contains(abrevation.toLowerCase())
								|| m.getKey().toString().contains(abrevation)) {
							System.out.println(m.getKey() + " " + m.getValue());

						}

					}

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
