package BaseCasevsIterateCase;

public class RecursiveMethods {
	
	//Example 1
	public int mystery(int n) {
		if(n<0) {
			return n*2;
		} else {
			return mystery(n-1) + mystery(n-2);
		}
	}
	
	//Example 2
	
	
	//Example 3
	
	
	//Example 4
	
	
	//Example 5
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
	
	//Example 6
	public int result(int n) {
		if(n==1) {
			return 2;
		} else {
			return 2 * result(n-1);
		}
	}

}
