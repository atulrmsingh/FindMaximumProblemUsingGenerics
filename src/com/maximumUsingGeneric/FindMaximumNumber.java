package com.maximumUsingGeneric;

import java.util.Arrays;

public class FindMaximumNumber<E extends Comparable<E>> {
	public static void main(String[] args) {
		FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
		try {
			Double max = (Double) new FindMaximumNumber(25.34,15).max();
			System.out.println(max);
		} catch (FindMaximumNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	E[] values;

	@SafeVarargs
	public FindMaximumNumber(E... values) {
		this.values = values;
	}

	public E max() throws FindMaximumNumberException {
		if (values.length == 0) {
			throw new FindMaximumNumberException("No Elements to Compare for");
		} else {
			Arrays.sort(values);
			printMax(values[values.length - 1]);
			return values[values.length - 1];
		}
	}

	public void printMax(E value) {
		System.out.println("Max Value = " + value);
	}

}
