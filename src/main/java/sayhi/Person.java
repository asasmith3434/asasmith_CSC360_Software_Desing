package sayhi;

public class Person {
	
	String fname;
	String lname;
	int age;
	
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: " + fname + " " + lname + "," + age + " ";
	}
	
	public static void main(String[] args) {
		Person r= new Person("Romeo", "Mon", 15);
		System.out.println("R " +r);
	}
	
}
