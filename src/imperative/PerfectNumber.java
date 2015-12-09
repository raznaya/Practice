package imperative;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {

	public enum STATE {
		DEFICIENT, PERFECT, ABUNDANT;
	}

	public static Set<Integer> divisors(int n) {
		Set<Integer> result = new HashSet<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result.add(i);
			}
		}

		return result;
	}

	public static STATE process(int n) {
		int sum = 0;

		for (int i : divisors(n)) {
			if (i != n)
				sum += i;
		}

		if (sum < n) {
			return STATE.DEFICIENT;
		} else if (sum == n) {
			return STATE.PERFECT;
		} else {
			return STATE.ABUNDANT;
		}
	}

}
