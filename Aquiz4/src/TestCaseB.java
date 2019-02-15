import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestCaseB {
	
	private final FindLast fl_test = new FindLast();

	@Test
	public void test1() {
		assertEquals(1,fl_test.findMyLast(new int[] {1,2,3},2));
	}
	
	@Test
	public void test2() {
		assertEquals(4,fl_test.findMyLast(new int[] {2,3,4,1,55,2},55));
	}
	
	@Test
	public void test3() {
		assertEquals(4,fl_test.findMyLast(new int[] {6,3,45,2,2,3,42,1},2));
	}

}
