import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestCaseD {
	
	private final FindLast fl_test = new FindLast();

	@Test
	public void test1() {
		assertEquals(0,fl_test.findMyLast(new int[] {6,3,3},6));
	}
	
	@Test
	public void test2() {
		assertEquals(0,fl_test.findMyLast(new int[] {2},2));
	}
	
	@Test
	public void test3() {
		assertEquals(0,fl_test.findMyLast(new int[] {8,6,7,5,3,0,9},8));
	}

}
