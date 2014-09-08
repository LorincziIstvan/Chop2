package edu.msg.chop2.chopchop;

import java.util.List;

public class Chop3 implements Chop {

	public Integer chop(Integer target, List<Integer> input) {
		try {
			if (input.isEmpty()) {
				return -1;
			}
		} catch (NullPointerException e) {
			return -1;
		}

		int front = 0;
		int back = input.size();
		int middle = 0;
		while (front < back) {
			middle = (front + back) / 2;
			if (input.get(middle) == target) {
				return middle;
			}
			if (input.get(middle) > target) {
				back = middle;

			} else {
				front = middle + 1;
			}

		}
		return -1;
	}

}
