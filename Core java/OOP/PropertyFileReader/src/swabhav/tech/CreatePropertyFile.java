package swabhav.tech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertyFile {
	public static void main(String args[]) throws FileNotFoundException, IOException {

		Properties props = new Properties();
		FileOutputStream fos = new FileOutputStream("d:/user.properties");

		props.setProperty("user", "System");
		props.setProperty("password", "oracle");

		props.store(fos, "Properties file generated from Java program");

		fos.close();

	}
}
