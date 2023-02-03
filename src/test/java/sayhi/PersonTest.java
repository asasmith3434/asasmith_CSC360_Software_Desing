package sayhi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	Person R;
	Person J;
	
	
	@BeforeEach 
	void setUp() throws Exception{
		R= new Person("Romeo","Mon",15);
		J= new Person("Juliet","Cap",13);
	}
	@Test
	void testToString() {
		assertEquals("Person: Romeo Mon,15 ", R.toString() );
		//fail("Not yet implemented");
		
	}
	@Test
	void testPerson() {
		Person child = R.makePerson(J);
		assertEquals(R.getFname(), child.getFname());
		assertEquals(J.getLname(), child.getLname());
		assertEquals(0, child.getAge());

	}
	
	
	

}
