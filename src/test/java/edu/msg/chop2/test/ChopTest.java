package edu.msg.chop2.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.msg.chop2.chopchop.Chop;
import edu.msg.chop2.chopchop.Chop1;

public class ChopTest {
	private List<Integer> input;
	private Chop chopper = new Chop1();

	@Test
	public void testChopCase1() {
		this.input = new ArrayList<Integer>();
		int firstInt = -1;
		int secondInt = chopper.chop(3, input);
		assertEquals(firstInt, secondInt);
	}

	@Test
	public void testChopCase2() {
		this.input = null;
		int firstInt = -1;
		int secondInt = chopper.chop(3, input);
		assertEquals(firstInt, secondInt);
	}

	@Test
	public void testChopCase3() {
		this.input = new ArrayList<Integer>();
		input.add(1);
		int firstInt = -1;
		int secondInt = chopper.chop(3, input);
		assertEquals(firstInt, secondInt);
		secondInt = chopper.chop(-1, input);
		assertEquals(firstInt, secondInt);
	}

	@Test
	public void testChopCase4() {
		this.input = new ArrayList<Integer>();
		input.add(1);
		int firstInt = 0;
		int secondInt = chopper.chop(1, input);
		assertEquals(firstInt, secondInt);
	}

	@Test
	public void testChopCase5() {
		this.input = new ArrayList<Integer>();
		input.add(1);
		input.add(3);
		input.add(5);
		int secondInt = chopper.chop(1, input);
		assertEquals(0, secondInt);
		secondInt = chopper.chop(3, input);
		assertEquals(1, secondInt);
		secondInt = chopper.chop(5, input);
		assertEquals(2, secondInt);

		secondInt = chopper.chop(0, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(2, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(4, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(6, input);
		assertEquals(-1, secondInt);

	}

	@Test
	public void testChopCase6() {
		this.input = new ArrayList<Integer>();
		input.add(1);
		input.add(3);
		input.add(5);
		input.add(7);
		int secondInt = chopper.chop(1, input);
		assertEquals(0, secondInt);
		secondInt = chopper.chop(3, input);
		assertEquals(1, secondInt);
		secondInt = chopper.chop(5, input);
		assertEquals(2, secondInt);
		secondInt = chopper.chop(7, input);
		assertEquals(3, secondInt);

		secondInt = chopper.chop(0, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(2, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(4, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(6, input);
		assertEquals(-1, secondInt);
		secondInt = chopper.chop(8, input);
		assertEquals(-1, secondInt);

	}

}
