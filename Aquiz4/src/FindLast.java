
public class FindLast {
	
	public int findMyLast (int[] x, int y) {
		for (int i=x.length-1; i>0; i--) {
		if (x[i] == y) { return i; }
		}
		return -1;
		}

}
