package Swabhav.techlabs;

public class Player {
	private int id;
	private String name;
	private int age;
	private static int count;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		count++;
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
		age = 18;
		count++; 
	}
	public int  getCount() {
		return count;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Player whoIsElder(Player second) {
		if (this.getAge() > second.getAge()) {
			return this;
		} else
			return second;
	}
}
