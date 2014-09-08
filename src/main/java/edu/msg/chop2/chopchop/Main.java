package edu.msg.chop2.chopchop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Chop3 chopper = new Chop3();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<100;i++)
		list.add(i);
		for(int i=0;i<101;i++)
		System.out.println(chopper.chop(i, list));
	}

}
