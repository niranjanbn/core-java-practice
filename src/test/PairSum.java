package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PairSum {
	static void printpairs(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (temp >= 0 && s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 10, 6, 8, 8 };
		int n = 16;
		printpairs(A, n);

		Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());

		Set<Integer> setWithPaired = new HashSet<>();

		Arrays.stream(A).forEach(x -> {
			/*if (x != (n - x) && !setWithPaired.contains(x) && set.contains(n - x)) {
				setWithPaired.add(x);
				setWithPaired.add(n - x);
				System.out.println("("+x + " " + (n - x)+")");
			}*/
			
			
			int temp = n - x;

			// checking for condition
			if (temp >= 0 && setWithPaired.contains(temp)) {
				System.out.println("Pair with given sum " + n + " is (" + x + ", " + temp + ")");
			}
			setWithPaired.add(x);
		});

	}
}