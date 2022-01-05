package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.maximumUsingGeneric.FindMaximumNumber;
import com.maximumUsingGeneric.FindMaximumNumberException;

//generic class and generic type variable test
public class FindMaximumNumberTest {

	@Test
	public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaximumNumberException {
		Integer max = new FindMaximumNumber<>(25, 5, 1).max();
		Assert.assertEquals((Integer) 25, max);
	}

	@Test
	public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaximumNumberException {
		Integer max = new FindMaximumNumber<>(1, 15, 5).max();
		Assert.assertEquals((Integer) 15, max);
	}

	@Test
	public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaximumNumberException {
		Integer max = new FindMaximumNumber<>(1, 15, 16).max();
		Assert.assertEquals((Integer) 16, max);
	}

	@Test
	public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaximumNumberException {
		Integer max = new FindMaximumNumber<>(1, 5, 8).max();
		Assert.assertEquals((Integer) 8, max);
	}

	/* Test Cases For Float Array */
	@Test
	public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws FindMaximumNumberException {
		Float max = new FindMaximumNumber<>(25.6f, 4.5f, 14.7f).max();
		Assert.assertEquals((Float) 25.6f, max);
	}

	@Test
	public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws FindMaximumNumberException {
		Float max = new FindMaximumNumber<>(1.6f, 35.6f, 2.6f).max();
		Assert.assertEquals((Float) 35.6f, max);
	}

	@Test
	public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws FindMaximumNumberException {
		Float max = new FindMaximumNumber<>(1.5f, 5.5f, 10.7f).max();
		Assert.assertEquals((Float) 10.7f, max);
	}

	@Test
	public void givenForthFloatNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws FindMaximumNumberException {
		Float max = new FindMaximumNumber<>(1.0f, 5.7f, 10.5f, 50.6f).max();
		Assert.assertEquals((Float) 50.6f, max);
	}

	/* Test Cases For String Array */
	@Test
	public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() throws FindMaximumNumberException {
		String max = new FindMaximumNumber<>("mom", "dad", "hat").max();
		Assert.assertEquals("mom", max);
	}

	@Test
	public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() throws FindMaximumNumberException {
		String max = new FindMaximumNumber<>("hellen", "mam", "dad").max();
		Assert.assertEquals("mam", max);
	}

	@Test
	public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() throws FindMaximumNumberException {
		String max = new FindMaximumNumber<>("hatt", "dad", "mam").max();
		Assert.assertEquals("mam", max);
	}

	@Test
	public void givenForthStringAsLarge_ShouldReturn_ForthStringAsMax() throws FindMaximumNumberException {
		String max = new FindMaximumNumber<>("home", "doar", "milk", "cat").max();
		Assert.assertEquals("milk", max);
	}

	@Test
	public void givenEmpty_ShouldReturn_AnException() {
		try {
			new FindMaximumNumber<>().max();
		} catch (FindMaximumNumberException e) {
			Assert.assertEquals("No Elements to Compare for", e.getMessage());
		}
	}
}