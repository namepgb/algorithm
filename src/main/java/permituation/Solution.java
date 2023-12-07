package main.java.permituation;

import java.util.*;

public class Solution
{
	public String solution(String[] cards1, String[] cards2, String[] goal)
	{
		int idx1 = 0, idx2 = 0;
		for (String s : goal) {
			if (cards1.length > idx1 && 0 == cards1[idx1].compareTo(s)) {
				++idx1;
			} else if (cards2.length > idx2 && 0 == cards2[idx2].compareTo(s)) {
				++idx2;
			} else {
				return "No";
			}
		}

		return "Yes";
	}
}
