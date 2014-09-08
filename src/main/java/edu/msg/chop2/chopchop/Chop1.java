package edu.msg.chop2.chopchop;

import java.util.List;

public class Chop1 implements Chop {

	private boolean isAtomic(List<Integer> input) {
		if (input.size() == 1)
			{return true;}
			{return false;}
	}

	private int getMiddlePosition(List<Integer> input) {
		try {
			return input.size() / 2;
		} catch (NullPointerException e) {
			return -1;
		}
	}

	private Integer targetFound(Integer target, List<Integer> input) {
		if (input.get(0).compareTo(target) == 0)
			return 0;
			{return -1;}
	}

	private Integer calculateLocalPosition(Integer middle, Integer position) {
		if (position > -1)
			return middle + position;
		else
			{return -1;}
	}

	private Integer calculatePosition(Integer middle, Integer position1,
			Integer position2) {

		int position1Second = calculateLocalPosition(0, position1);
		int position2Second = calculateLocalPosition(middle, position2);
		int min = minPosition(position1Second, position2Second);
		if (min > -1) {
			return min;
		}
		{return -1;}
	}

	private Integer minPosition(Integer a, Integer b) {
		if (a > -1) {
			if (b > -1) {
				return Math.min(a, b);
			} else {
				return a;
			}
		} else {
			if (b > -1) {
				return b;
			} else {
				return -1;
			}
		}
	}

	public boolean notEmptyList(List<Integer> input) {
		try {

			if (!input.isEmpty())
				{return true;}
				{return false;}
		} catch (NullPointerException e) {
			return false;
		}
	}

	public Integer chop(Integer target, List<Integer> input) {
		if (notEmptyList(input)) {

			if (isAtomic(input)) {
				return targetFound(target, input);

			} else {
				int middle = getMiddlePosition(input);
				int position1 = chop(target, input.subList(0, middle));

				int position2 = chop(target,
						input.subList(middle, input.size()));

				return calculatePosition(middle, position1, position2);
			}
		} else
			{return -1;}

	}

}
