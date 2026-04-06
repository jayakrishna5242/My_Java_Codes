package com.GUT;

public class GetBigByRemovingOneDigit {

	void main() {
		int n = 1332134124;
		int m = 1;

		String s = Integer.toString(n);

		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' == m) {
				String s1 = s.substring(0, i);
				String s2 = s.substring(i + 1, s.length());

				String s3 = (s1 + s2);
				int submax = Integer.parseInt(s3);
				if (submax > max) {
					max = submax;
				}
			}
		}

		System.out.println(max);
	}

}
