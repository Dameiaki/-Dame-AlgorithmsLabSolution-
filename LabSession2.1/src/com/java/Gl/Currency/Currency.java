package com.java.Gl.Currency;

public class Currency {
	public void noOfdenominations(int notes[], int target) {

		int[] noteCounter = new int[notes.length];

		for (int i = 0; i < notes.length; i++) {
			if (target >= notes[i]) {
				noteCounter[i] = target / notes[i];
				target = target - noteCounter[i] * notes[i];
			}
		}
		if (target > 0) {
			System.out.println("Amount cannot be be divided by the denominations");
		} else {
			System.out.println("The payment approach is");
			for (int i = 0; i < notes.length; i++) {
				if (noteCounter[i] != 0) {
					System.out.println(notes[i] + ": " + noteCounter[i]);
				}

			}
		}

	}
}
