package Evennumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvennumberTest {

	Evennumber a = new Evennumber();
	@Test
	void Checktest() {
		assertEquals("Even", a.check(10));
	}

}
