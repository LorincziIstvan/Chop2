package edu.msg.chop2.chopchop;

import java.util.List;

public class Chop2 implements Chop {

	private int getMiddlePosition(List<Integer> input) {
		try {
			return input.size() / 2;
		} catch (NullPointerException e) {
			return -1;
		}
	}

	public boolean notEmptyList(List<Integer> input) {
		try {

			if (!input.isEmpty())
				return true;
				return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

	public Integer chop(Integer target, List<Integer> input) {
		if (notEmptyList(input)) {
			int middlePosition = getMiddlePosition(input);
			int middleValue = input.get(middlePosition);

			if (target == middleValue) {
				return middlePosition;
			}

			if (target < middleValue) {
				return chop(target, input.subList(0, middlePosition));
			} else {
				if (target > middleValue) {

					int position = chop(target,
							input.subList(middlePosition + 1, input.size()));
					if (position > -1) {
						return middlePosition + position+1;
					} else {
						return -1;
					}
				}

			}
			return -1;
		} else
			return -1;
	}
}
