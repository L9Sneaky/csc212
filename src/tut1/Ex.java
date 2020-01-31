package tut1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex {
	private int[] arr;

	public Ex(int n,int min, int max) {
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandomNumberInRange(min,max); // storing random integers in an array
		}
	}
	public Ex(int n) {
		arr = new int[n];
		List<Integer> numbers = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
		  numbers.add(i);
		  }
		Collections.shuffle(numbers);
		for(int i=0;i<n;i++) {
			arr[i] = numbers.get(i);
		}
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}