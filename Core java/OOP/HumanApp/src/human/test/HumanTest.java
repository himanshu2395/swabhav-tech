package human.test;

import com.techlabs.human.Human;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "himanshu";
		h1.setAge(24);
		h1.setWeight(85);
		h1.setHeight(177);
		h1.setGender("MalE");
		h1.doWorkout();
		printDetails(h1);

		Human h2 = new Human();
		h2.setAge(33);
		h2.setWeight(77);
		h2.setHeight(165);
		h2.setGender("FeMaLe");
		h2.doWorkout();
		printDetails(h2);
		printDetails(new Human());
		System.out.println(new Human().getHeight());
		System.out.println(new Human());
		/*Human abc = null;
		printDetails(abc);*/
		
		
	}
	

	public static void printDetails(Human human) {
		System.out.println("Age is=" + human.getAge());
		System.out.println("Weight is=" + human.getWeight());
		System.out.println("height is=" + human.getHeight());
		System.out.println("gender is=" + human.getGender());
	}


}
