import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class JulianDateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testJulianDate() {
		assertEquals(1355818,JulianDate.giveJulianDate(-1000, 1, 1));
		assertEquals(2451545,JulianDate.giveJulianDate(2000, 1, 1));
		assertEquals(1000000,JulianDate.giveJulianDate(-1975, 10, 21));
		assertEquals(2458899,JulianDate.giveJulianDate(2020, 2, 20));
	}
	
	@Test
	void testDaysBetween() {
		
		assertEquals(1,JulianDate.getTimeBetween(0,1));
		assertEquals(1,JulianDate.getTimeBetween(1,0));
		assertEquals(1464,JulianDate.getTimeBetween(JulianDate.giveJulianDate(2021,5,20), JulianDate.giveJulianDate(2017,5,17)));
		assertEquals(1464,JulianDate.getTimeBetween(JulianDate.giveJulianDate(2017,5,17), JulianDate.giveJulianDate(2021,5,20)));
	}

}
