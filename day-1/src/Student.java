
public class Student {
	private String name;
	private byte age;
	
	void study() {
		System.out.println(getName()+"is studying");
	}
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
