package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1898, 31, 31);
	    String string0 = nextDate0.run(3, 31, 1898);
	    assertEquals("4/1/1898", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1895, 1895, 1895);
	    String string0 = nextDate0.run(1, 1895, 1895);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1923, 31, 31);
	    String string0 = nextDate0.run(6, 31, 1923);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1865, 1865, 1865);
	    String string0 = nextDate0.run(10, 10, 1865);
	    assertEquals("10/11/1865", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1830, 1830, 1830);
	    String string0 = nextDate0.run(9, 30, 1830);
	    assertEquals("10/1/1830", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1933, 1933, 1933);
	    String string0 = nextDate0.run(4, 4, 1933);
	    assertEquals("4/5/1933", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1865, 1865, 1865);
	    String string0 = nextDate0.run(2, 30, 1865);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1443), (-1443), (-1443));
	    String string0 = nextDate0.run((-1443), 1865, (-1443));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 9);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1915, 1915, 1915);
	    String string0 = nextDate0.run(11, 31, 1915);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1898, 1898, 1898);
	    String string0 = nextDate0.run(1898, 1898, 1898);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1865, 1865, 1865);
	    String string0 = nextDate0.run(8, 8, 1865);
	    assertEquals("8/9/1865", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(4593, 4593, 4593);
	    String string0 = nextDate0.run(4, 4, 4593);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1829, 1829, 1829);
	    String string0 = nextDate0.run(7, 7, 1829);
	    assertEquals("7/7/1829", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1818, 1818, 1818);
	    String string0 = nextDate0.run(12, 12, 1818);
	    assertEquals("12/13/1818", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1830, 1830, 1830);
	    String string0 = nextDate0.run(2, 28, 1830);
	    assertEquals("3/1/1830", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1865, 1865, 1865);
	    String string0 = nextDate0.run(2, 2, 1865);
	    assertEquals("2/3/1865", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1939, 1939, 1939);
	    String string0 = nextDate0.run(2, 29, 1939);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1835, 1835, 1835);
	    String string0 = nextDate0.run(5, 24, 1835);
	    assertEquals("5/25/1835", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1895, 1895, 1895);
	    String string0 = nextDate0.run(1, 1, 1895);
	    assertEquals("1/2/1895", string0);
	}

}