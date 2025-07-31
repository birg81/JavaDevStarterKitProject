package pkg.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

	@Test
	void testConstructorAndGetters() {
		assertEquals(new Person("   ", null, -1).toString(), new Person().toString());
	}

	@Test
	void testSetters() {
		Person p = new Person("Mario", "Rossi", 25);

		p.setFirstname("Luigi    ");
		p.setLastname("   Verdi");
		p.setAge(-1);

		assertEquals("Luigi", p.getFirstname());
		assertEquals("Verdi", p.getLastname());
		assertEquals(25, p.getAge());
	}

	@Test
	void testToString() {
		Person p = new Person("Biagio", "Greco", 40);
		String expected = "Hi! I'm Biagio Greco. I'm 40...";
		assertEquals(expected, p.toString());
	}
}
