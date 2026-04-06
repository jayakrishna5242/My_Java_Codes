package com.DSA;

public class PalindromicSubstring {

	boolean isPalindrome(String s) {

		int start = 0, end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}

	void main() {
		String s = "nnayannnamantenet";

		int start = 0;
		for (int i = start + 1; i < s.length(); i++) {

			String sub = s.substring(start, i + 1);

			if (isPalindrome(sub)) {
				System.out.print(sub + " ");
				start = ++i;
			}

		}
	}

}
