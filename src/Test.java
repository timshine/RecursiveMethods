class Test {
	// displays consecutive integers from k to n
	public static void countUp(int k, int n) {
		if (k <= n) {
			System.out.print(k + " ");
			k++;
			countUp(k, n);
		}
	}

	// displays consecutive integers backwards from k to n
	public static void countDown(int k, int n) {
		if (k <= n) {
			countDown(k + 1, n);
			System.out.print(k + " ");
		}
	}

	// returns the sum of all integers 1 + 2 + .... + n-1 + n
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sum(n - 1);
		}

	}

	// returns n factorial
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	// returns the nth Fibonacci number
	public static int fibo(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}

	// returns the gcf of n1 and n2
	public static int gcf(int n1, int n2) {
		int rem = n1%n2;
		if(rem == 0){
			return n2;
		}else{
			return gcf(n2,rem);
		}
		
	}

	// returns n1 raised to the n2 power
	public static int pow(int n1, int n2) {
		if(n2 == 0)
			return 1;
		else if(n2 == 1)
			return n1;
		else{
			return n1 * pow(n1,n2-1);
		}
		
	}

}
