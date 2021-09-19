package com.java.Gl.Currency;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		MergeSortImplementation sort = new MergeSortImplementation();
		Currency denom = new Currency();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Currency Denomination");
		int size = in.nextInt();
		int denomination[] = new int[size];

		System.out.println("Enter the Denominations");
		for (int i = 0; i < denomination.length; i++) {
			denomination[i] = in.nextInt();
		}
		System.out.println("Enter the Amount you want to pay");
		int target = in.nextInt();

		sort.sort(denomination, 0, denomination.length - 1);
		denom.noOfdenominations(denomination, target);

		in.close();

	}

}
