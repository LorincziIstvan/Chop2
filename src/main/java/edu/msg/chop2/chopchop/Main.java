package edu.msg.chop2.chopchop;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private Main() {

	}

	public static void main(String[] args) {

		Chop3 chopper = new Chop3();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++)
			list.add(i);
		for (int i = 0; i < 101; i++)
			chopper.chop(i, list);
		
	}

}
