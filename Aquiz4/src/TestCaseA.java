import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestCaseA {
	
	private final FindLast fl_test = new FindLast();
	
	@Test
	public void test1() {
		assertThrows(NullPointerException.class, 
				() -> fl_test.findMyLast(null,3));
	}
	@Test
	public void test2() {
		assertThrows(NullPointerException.class, 
				() -> fl_test.findMyLast(null,5));
	}
	@Test
	public void test3() {
		assertThrows(NullPointerException.class, 
				() -> fl_test.findMyLast(null,10));
	}

}
