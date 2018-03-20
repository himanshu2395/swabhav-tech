package swabhav.tech.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StateData {
	public static void main(String args[]) throws FileNotFoundException, IOException {

		Properties props = new Properties();
		FileOutputStream fos = new FileOutputStream("d:/StateCode.properties");

		props.setProperty("AP", "Andhra Pradesh");
		props.setProperty("AR", "Arunachal Pradesh");
		props.setProperty("AS", "Assam");
		props.setProperty("BR", "Bihar");
		props.setProperty("CG", "Chhattisgarh");
		props.setProperty("GA", "Goa");
		props.setProperty("GJ", "Gujarat");
		props.setProperty("HR", "Haryana");
		props.setProperty("HP", "Himachal Pradesh");
		props.setProperty("JK", "Jammu and Kashmir");
		props.setProperty("JH", "Jharkhand");
		props.setProperty("KA", "Karnataka");
		props.setProperty("KL", "Kerala");
		props.setProperty("MP", "Madhya Pradesh");
		props.setProperty("MH", "Maharashtra");
		props.setProperty("MZ", "Manipur");
		props.setProperty("MG", "Meghalaya");
		props.setProperty("MZ", "Mizoram");
		props.setProperty("NL", "Nagaland");
		props.setProperty("OR", "Orissa");
		props.setProperty("PB", "Punjab");
		props.setProperty("RJ", "Rajasthan");
		props.setProperty("SK", "Sikkim");
		props.setProperty("TN", "Tamil Nadu");
		props.setProperty("TR", "Tripura");
		props.setProperty("UK", "Uttarakhand");
		props.setProperty("UP", "Uttar Pradesh");
		props.setProperty("WB", "West Bengal");
		props.setProperty("TN", "Tamil Nadu");
		props.setProperty("TR", "Tripura");
		props.setProperty("AN", "Andaman and Nicobar Islands");
		props.setProperty("CH", "Chandigarh");
		props.setProperty("DH", "Dadra and Nagar Haveli");
		props.setProperty("DD", "Daman and Diu");
		props.setProperty("DL", "Delhi");
		props.setProperty("LD", "Lakshadweep");
		props.setProperty("PY", "Pondicherry");

		props.store(fos, "Properties file generated from Java program");

		fos.close();

	}

}
