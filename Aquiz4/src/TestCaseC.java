import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestCaseC {
	
	private final FindLast fl_test = new FindLast();

	@Test
	public void test1() {
		assertEquals(-1,fl_test.findMyLast(new int[] {3,2,1,0},5));
	}
	
	@Test
	public void test2() {
		assertEquals(-1,fl_test.findMyLast(new int[] {23,22,21,20},24));
	}
	
	@Test
	public void test3() {
		assertEquals(-1,fl_test.findMyLast(new int[] {6,2,1,14,91},10));
	}

}
