package swabhav.testlabs.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import swabhav.techlabs.Human;

public class TestSerialization {

	public static void main(String[] args) {
		ArrayList<Human> al = new ArrayList<Human>();
		al.add(new Human());

		for (Human x : al) {
			// Human h = (Human) x;
			x.setAge(23);
			x.setWeight(60);
			// System.out.println(x.getAge());
			// System.out.println(x.getWeight());

			try {
				FileOutputStream fos = new FileOutputStream("D:\\file.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(al);
				oos.close();
				fos.close();
				System.out.println("obeject have been serialized");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		ArrayList<Human> a1 = new ArrayList<Human>();
		try {
			FileInputStream fis = new FileInputStream("D:\\file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			a1 = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Object has been deserialized ");

		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		for (Human y : a1) {
			System.out.println("age = " + y.getAge());
			System.out.println("weight = " + y.getWeight());
		}
	}
}
