package pkg.model;
public class Person {
	private String firstname, lastname;
	private int age;
	public Person(String firstname, String lastname, int age) {
		this.firstname = (firstname != null && !firstname.isBlank()) ? firstname.strip() : "(no firstname)";
		this.lastname = (lastname != null && !lastname.isBlank()) ? lastname.strip() : "(no lastname)";
		this.age = (age > 0) ? age : 0;
	}
	public Person() {
		this(null, null, -1);
	}
	public void setFirstname(String firstname) {
		if(firstname != null && !firstname.isBlank())
			this.firstname = firstname.strip();
	}
	public void setLastname(String lastname) {
		if(lastname != null && !lastname.isBlank())
			this.lastname = lastname.strip();
	}
	public void setAge(int age) {
		if(age > 0)
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Hi! I'm %s %s. I'm %d...".formatted(firstname, lastname, age);
	}
}
