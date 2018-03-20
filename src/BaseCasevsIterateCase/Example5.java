package BaseCasevsIterateCase;

public class Example5 {
	
	public int recur(int k, int n) {
		if (n == k) {
			return k;
		} else {
			if (n > k) {
				return recur(k, n - k);
			} else {
				return recur(k - n, n);
			}
		}
	}

}
