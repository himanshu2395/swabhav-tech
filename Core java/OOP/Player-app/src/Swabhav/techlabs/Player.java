package Swabhav.techlabs;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
		age = 18;
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
		/*int p1Age = this.getAge();
		int p2Age = second.getAge();*/
		Player temp = second;
		if(this.getAge()>second.getAge()) {
			temp = this;
		}else
			temp = second;
		System.out.println(temp.getName());
		return temp;
	}
}
	

